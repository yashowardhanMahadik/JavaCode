ublic class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProduct(final List<Integer> A) {
        if (A.size() == 0) {
            return 0;
        }
        int[] posProduct = new int[A.size()];
        int[] negProduct = new int[A.size()];
        int[] maxProduct = new int[A.size()];
        posProduct[0] = negProduct[0] = maxProduct[0] = A.get(0);
        for (int i = 1;i < A.size();i++) {
            int a = posProduct[i-1] * A.get(i);
            int b = negProduct[i-1] * A.get(i);
            posProduct[i] = Math.max(Math.max(a, b), A.get(i));
            negProduct[i] = Math.min(Math.min(a, b), A.get(i));
            maxProduct[i] = Math.max(posProduct[i], maxProduct[i-1]);
        }
        // for(int i=0;i<A.size();i++)
        // {
        //     System.out.print(" |"+posProduct[i]);
        // }
        // System.out.println();
        // for(int i=0;i<A.size();i++)
        // {
        //     System.out.print(" |"+negProduct[i]);
        // }
        // System.out.println();
        return maxProduct[A.size()-1];
    }
}

