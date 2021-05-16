//>4
public class Solution {
    public int solve(int A) {
        int count =0;
         while((A & 1) == 0 && A>0)//while(A&0)
        {
            count++;
            A=(A>>1);
        }
        return count;
    }
}
