public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int len = A.size();
        int cnt=0;
        int ssum =0;
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        for(int i=1;i<len;i++)
        {
            if(A.get(i-1)<A.get(i))
            {
                minpq.add(A.get(i)-A.get(i-1));
                cnt++;
                // ssum+=A.get(i)-A.get(i-1);
                // System.out.println(A.get(i)-A.get(i-1)+"   peek:");
            }
        }
        // System.out.println(cnt+"  2222 sum:"+ssum);
        while(B<cnt)
        {
            minpq.poll();
            cnt--;
        }
        // System.out.println(cnt+"   sum:"+ssum);
        int sum =0;
        while(minpq.peek()!=null)
        {
            // System.out.println(cnt+"   poll:"+minpq.peek());
            sum+= minpq.poll();
            
        }
        return sum;
    }
}