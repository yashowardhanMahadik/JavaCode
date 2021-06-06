public class Solution {
    public int anytwo(String A) {
          int n=A.length();
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int count;
                if(i!=j&&A.charAt(i-1)==A.charAt(j-1)){
                    count=1+dp[i-1][j-1];
                }else{
                    count=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                if(count>1) return 1;
                else dp[i][j]=count;
            }
        }
        return 0;
    }
}