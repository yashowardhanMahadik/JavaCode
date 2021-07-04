/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
    1
1   3   4   2
    2
4   5   6
    6
7   9
    3
    5
8
9
*/
import java.util.*;
import java.lang.Integer;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int members = sc.nextInt();
        int mem[] = new int[members];
        HashMap<Integer,ArrayList<Integer>> hmap = new HashMap<>();
        for(int i=0;i<members;i++){
            mem[i] = sc.nextInt();
            
            //Adjlist.add(new ArrayList<Integer>(mem[i]));
        }
        int edge = sc.nextInt();
        for(int i=0;i<edge;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(!hmap.containsKey(u)){
                hmap.put(u,new ArrayList<Integer>());
                hmap.get(u).add(v);
            }
            else{
                hmap.get(u).add(v);
            }
            //Adjlist.get(u).add(v);
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        TestClass tc = new TestClass();
        HashSet<Integer> visited;
        visited = new HashSet<>();
        int ans = tc.dfs(hmap,start,end,visited);
        System.out.println(ans);

    }
    public int dfs(HashMap<Integer,ArrayList<Integer>> hmap, int v, int end,HashSet<Integer> visited){
         if(!hmap.containsKey(v)){
            //System.out.println(" -> sdsd");
            return 0;
        }
        if(visited.contains(v)){
            return 0;
        }
        if(v==end){
            //System.out.println(" ->sds ");
            return 1;
        }
        visited.add(v);
        int ans =0;
        for(int num : hmap.get(v)){
            if(num==end){
                //System.out.println(" inter-> "+num);
                return 1;
            }
            //System.out.println(" -> "+num);
            int k = dfs(hmap,num,end,visited);
            if(k==1)
                ans=1;
        }
        return ans;
    }
}
