1. use 2 nested loops
2. upper loop 1 to A.length
3. lower loop 0 to difference 
4. use Set<Integer> and store each product
5. if Set.contains(product) return 0;
6. else add it to the set.
7. return 1*/

public class Solution {
    public int colorful(int A) {
        A = Math.abs(A);
        Set<Integer> set = new HashSet<Integer>();
        int length = String.valueOf(A).length();
        String aa = String.valueOf(A);
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length-i;j++)
            {
                String k = aa.substring(j,j+i+1);
                //System.out.println(k);
                int multiply = Integer.parseInt(k); //int multiply *= A.charAt(j)-'0';  *** 
                int mul = 1;
                while(multiply>1)
                {
                    mul= mul* (multiply%10);
                    //System.out.println("Mltiply_>  "+mul);
                    multiply=multiply/10;
                }
                if(set.contains(mul))
                {
                    return 0;
                }
                else
                {
                set.add(mul);
                }
                //System.out.println(">  "+mul);
                
            }
        
         }
         return 1;
    }
}