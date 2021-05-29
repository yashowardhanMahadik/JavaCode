public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Collections.sort(A,Collections.reverseOrder());
        TreeSet<Integer> tset = new TreeSet<Integer>();
        ArrayList<Integer> alist = new ArrayList<Integer>();
        if(B<1)
            return alist;
        if(A==null)
            return alist;
        for(int i=0;i<A.size();i++)
        {
            tset.add(A.get(i));
            //System.out.println(tset.last()+"last     : size"+tset.size());
            if(tset.size()==B)
            {
                
                for(int k = 0;k<B;k++)
                {
                   // System.out.println(tset.last()+"     k"+k);
                    alist.add(tset.pollLast());
                }
                return alist;
            }
        }
        int klast = tset.size();
        for(int k = 0;k<klast;k++)
        {
                    //System.out.println(tset.last()+"     klasst poll"+k);
                    alist.add(tset.pollLast());
        }
        return alist;
    }
}
