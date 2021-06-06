public class Solution {
    public int solve(String A, String B) {
        
        int[][] dp = new int[A.length()+1][B.length()+1];
        
        for(int i=dp.length-2;i>=0;i--)
        {
            for(int j=dp[0].length-2;j>=0;j--)
            {
                char a = A.charAt(i);
                char b = B.charAt(j);
                if(a==b)
                {
                    dp[i][j]= 1+dp[i+1][j+1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}