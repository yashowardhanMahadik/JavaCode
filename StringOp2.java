public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isScramble(final String A, final String B) {
        char[] temp1 =A.toCharArray();
        char[] temp2 =B.toCharArray();
        
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        for(int i=0;i<temp1.length;i++)
        {
            if(temp1[i]!=temp2[i])
                return 0;
        }
        return 1;
    }
}