public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        
        int[][] dp = new int[B.size()+1][C+1];
        
        for(int i=0;i<B.size()+1;i++)
        {
            for(int j=0;j<C+1;j++)
            {
                if(j==0)
                {
                    dp[i][j]=0;
                }
                else if(i==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                    if(B.get(i-1)<=j)
                    {
                        dp[i][j] = Math.max(dp[i][j],A.get(i-1)+dp[i-1][j-B.get(i-1)]);
                    }
                }
            }
        }
        //System.out.println(dp[B.size()][C]);
        int last = C;
        while(last>=0)
        {
            if(dp[B.size()][last]!=0)
            {
                return dp[B.size()][last];
            }
            last--;
        }
        return 0;
    }
}