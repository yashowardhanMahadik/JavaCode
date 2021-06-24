public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        if(A==null || A.size() == 0)
            return 0;
        ArrayList<Integer>  B = new ArrayList<>();
        B.addAll(A);
        Collections.reverse(B);
        // B.addAll(Collections.sort(A,Collections.reverseOrder());
        int[] dp = new int[A.size()+1];
        
        for(int i=0;i<A.size();i++)
        {
            int max =0;
            for(int j=0;j<i;j++)
            {
                if(A.get(i)>A.get(j) && max < dp[j])
                {
                    max = dp[j];
                }
            }
            dp[i] = 1 + max;
        }
        
        int[] dp2 = new int[B.size()+1];
        
        for(int i=0;i<B.size();i++)
        {
            int max =0;
            for(int j=0;j<i;j++)
            {
                if(B.get(i)>B.get(j) && max < dp2[j])
                {
                    max = dp2[j];
                }
            }
            dp2[i] = 1 + max;
        }
        int maxx = 1;
        int size = B.size();
        for(int i=0;i<A.size();i++)
        {
            int sum = dp[i]+dp2[size-1-i]-1;
            if(sum>maxx)
                maxx=sum;
        }
        // System.out.println(A.size());
        return maxx;
        
    }
}