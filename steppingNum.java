link: https://www.interviewbit.com/old/problems/stepping-numbers/
# wow solution
public class Solution {
    public ArrayList<Integer> stepnum(int A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        if (A > B) return res;
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 9; i++) q.add(i);
        
        if (A == 0) res.add(0);
        while (!q.isEmpty()) {
            int p = q.poll();
            if (p < B) {
                int last = p % 10;
                if(last==0){
                    q.add(p*10 + 1);
                }
                else if(last==9){
                    q.add(p*10 + 8);
                }
                else{
                    q.add(p*10 + last - 1);
                    q.add(p*10 + last + 1);
                }
            }
            if (p >= A && p <= B) res.add(p);
        }
        return res;
    }
    
}