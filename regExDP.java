public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isMatch(final String A, final String B) {
        
        int alen = A.length();
        int blen = B.length();
        int[][] dp = new int[blen+1][alen+1];
        dp[0][0]=1;
        for(int i=2;i<blen+1;i++)
        {
            //System.out.println(B.charAt(i-1));
            if(B.charAt(i-1)=='*')
            {
                dp[i][0]=dp[i-2][0];
                //System.out.println("asd "+dp[0][i]);
            }
        }
        for(int i=1;i<blen+1;i++)
        {
            for(int j=1;j<alen+1;j++)
            {//System.out.println("2"+B.charAt(j-1));
                if(A.charAt(j-1)==B.charAt(i-1))
                {
                    //System.out.println("1");
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(B.charAt(i-1)=='.')
                {
                    //System.out.println("2");
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(B.charAt(i-1)=='*')
                {
                    //System.out.println("3>>>>>"+i+j);
                    dp[i][j] = dp[i-2][j];
                    if(A.charAt(j-1)==B.charAt(i-2)|| B.charAt(i-2)=='.')
                    {
                     dp[i][j] = (dp[i][j]==1 || dp[i][j-1]==1 ? 1: 0);
                    }
                }
                else
                {
                    //System.out.println("4");
                    dp[i][j]=0;
                }
            }
        }
        // for(int i=0;i<blen+1;i++)
        // {
        //     for(int j=0;j<alen+1;j++)
        //     {
        //         System.out.print("->  "+dp[i][j]);
        //     }
        //     System.out.println();
        // }
        return dp[blen][alen];
        
    }
}