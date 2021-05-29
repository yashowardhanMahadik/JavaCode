public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Collections.sort(A,Collections.reverseOrder());
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder()); 
        //TreeSet<Integer> tset = new TreeSet<Integer>();
        ArrayList<Integer> alist = new ArrayList<Integer>();
        if(B<1)
            return alist;
        if(A==null)
            return alist;
        for(int i=0;i<A.size();i++)
        {
            maxPQ.add(A.get(i));
            //System.out.println(maxPQ.peek()+"last     : size"+maxPQ.size());
            if(maxPQ.size()==B)
            {
                
                for(int k = 0;k<B;k++)
                {
                    //System.out.println(maxPQ.peek()+"     k"+k);
                    alist.add(maxPQ.poll());
                }
                return alist;
            }
        }
        int klast = maxPQ.size();
        for(int k = 0;k<klast;k++)
        {
                    //System.out.println(maxPQ.peek()+"     klasst poll"+k);
                    alist.add(maxPQ.poll());
        }
        return alist;
    }
}
