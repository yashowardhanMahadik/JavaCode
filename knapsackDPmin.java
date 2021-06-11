public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int sum = 0;
        int[][] dp = new int[1000][1000];
        //instead of creating dp in oneMax creating here to reduce time complexity
        for(int i=0;i<A.size();i++)
        {
            sum+= oneMax(B,C,A.get(i),dp);
        }
        return sum;
    }
    int oneMax(List<Integer> B, List<Integer> C, int mx, int[][] dp)
    {
        int max = mx;
        
        
        for(int i=0;i<B.size()+1;i++)
        {
            for(int j=0;j<max+1;j++)
            {
                if(j==0)
                {
                    dp[i][j]=0;
                    
                }
                else if(i==0)
                {
                    dp[i][j]=(int)1e9;
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                    if(j>=B.get(i-1))
                    {
                        dp[i][j] = Math.min(dp[i][j],C.get(i-1)+dp[i][j-B.get(i-1)]);
                    }
                }
            }
        }
        return dp[B.size()][max];
    }
}