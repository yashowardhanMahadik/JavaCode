link: https://www.interviewbit.com/old/problems/possibility-of-finishing-all-courses-given-prerequisites/
public class Solution {
    boolean[] visited;
    boolean[] stacked;
    List<Integer> adj[];
    public void addEdge(int a,int b){
        adj[a].add(b);
    }
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        visited = new boolean[A];
        stacked = new boolean[A];
        adj = new LinkedList[A];
        for(int i=0;i<A;i++){
            adj[i] = new LinkedList<Integer>();
        }
        for(int i=0;i<B.size();i++){
            int y = B.get(i)-1;
            int z = C.get(i)-1;
            addEdge(y,z);
        }
        for(int i=0;i<A;i++){
            if(isDfsCycle(i)){
                return 0;
            }
        }
        return 1;
    }
    public boolean isDfsCycle(int v){
        if(stacked[v])
            return true;
        if(visited[v])
            return false;
        visited[v]=true;
        stacked[v]=true;
        for(int x : adj[v]){
            if(isDfsCycle(x))
                return true;
        }
        stacked[v]=false;
        return false;
    }
    
}