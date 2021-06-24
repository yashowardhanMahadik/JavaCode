public class Solution {
    int maxx=0;
    int[][] visited = new int[100][100];
    public int solve(ArrayList<ArrayList<Integer>> A) {
        
        if(A.isEmpty())
            return 0;
        for(int m=0;m<A.size();m++){
            for(int n=0;n<A.get(0).size();n++){
                if(A.get(m).get(n)==0 || visited[m][n]!=0){
                    visited[m][n]=1;
                }
                else{
                    dfs(A,m,n,A.size(),A.get(0).size(),0);
                }
            }
        }
        int mx = this.maxx;
        if(mx>0)
            return mx+1;
        return 0;
    }
    public int dfs(ArrayList<ArrayList<Integer>> A, int m, int n,int maxm, int maxn, int count){
        if(m>=maxm || n>=maxn||m<0||n<0||A.get(m).get(n)==0||visited[m][n]!=0){
                    return 0;
            }
            visited[m][n]=1;
            int cnt=count;
            int left = dfs(A,m,n-1,maxm,maxn,count+1);
            int right = dfs(A,m,n+1,maxm,maxn,count+1);
            int up = dfs(A,m-1,n,maxm,maxn,count+1);
            int down = dfs(A,m+1,n,maxm,maxn,count+1);
            int upleft = dfs(A,m-1,n-1,maxm,maxn,count+1);
            int upright = dfs(A,m-1,n+1,maxm,maxn,count+1);
            int downleft = dfs(A,m+1,n-1,maxm,maxn,count+1);
            int downright = dfs(A,m+1,n+1,maxm,maxn,count+1);
            
            cnt = left + right + up + down + upright + upleft + downright + downleft;
            if(cnt >maxx) 
                maxx = cnt;
        
        return cnt+1;
    }
}