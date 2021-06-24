link: https://www.interviewbit.com/problems/commutable-islands/
public class Solution {
    int[] parent;
    int[] size;
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        parent = new int[A+1];
        size = new int[A+1];
        //kruskal logic
        Collections.sort(B,(o1,o2)-> o1.get(2)-o2.get(2));
        //make_set
        for(int i=1;i<A+1;i++){
            parent[i]=i;
        }
        //find_set
        int minsum=0;
        for(int i=0;i<B.size();i++){
            //System.out.println("asdas  "+i+"  dwed  "+B.get(i).get(0));
            int para = findSet(B.get(i).get(0));
            int parb = findSet(B.get(i).get(1));
            //join_set
            if(para!=parb){
                //System.out.println("added  "+B.get(i).get(0)+"  "+B.get(i).get(1));
                minsum+=B.get(i).get(2);
                joinSet(para,parb);
            }
        }
        
        return minsum;
    }
    public int findSet(int v){
        if(parent[v]==v){
            return v;
        }
        return parent[v]=findSet(parent[v]);
    }
    public void joinSet(int v1,int v2){
        parent[v2]=parent[v1];
    }
}
