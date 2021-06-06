matrix chain multiplication DP method used
here recursion with for loop is called which make MCM unique
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isScramble(final String A, final String B) {
        if(A==null||B==null||A.length()!=B.length())
            return 0;
        if(A.equals(B))
	        return 1;
	    char a1[],a2[];
	    a1=A.toCharArray();
	    a2=B.toCharArray();
	    Arrays.sort(a1);Arrays.sort(a2);
	    if(!(new String(a1).equals(new String(a2))) )
	        return 0;
	   for(int i=1;i<A.length();i++)
	   {
        if(isScramble(A.substring(0,i),B.substring(0,i))==1 && isScramble(A.substring(i),B.substring(i))==1)
            return 1;
        if(isScramble(A.substring(0,i),B.substring(B.length()-i))==1 && isScramble(A.substring(i),B.substring(0,B.length()-i))==1)
            return 1;    
	   }
        return 0;
        
    }
}