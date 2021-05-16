//kmp algo ??
public class Solution { //this is using Boolean String.contains() & int String.indexOf()
	public int strStr(final String haystack, final String needle) {
	    
	    if((haystack==null)||(needle==null))
	    return -1;
	    
	    if(haystack.contains(needle))
	    return haystack.indexOf(needle);
	    else
        return -1;
        char[] zeros = new char[a.length() - b.length()];
            Arrays.fill(zeros, '0');                    //char array
            String b = "king";
            b = new String(zeros) + b;                  //convert char[]1 to String
            first = Integer.parseInt(""+A.charAt(i));   //convert char[]2 to String
                                                    //and convert String to int 
            second = j < 0 && i >= 0 ? 0 : Integer.parseInt(""+B.charAt(j));
	}
}
public class Solution {  //this using Boolean String.isEmpty() & int String.charAt() 
	public int strStr(final String haystack, final String needle) {
	    if((haystack.isEmpty() && needle.isEmpty()) || needle.isEmpty()){
	        return -1;
	    }
	    int m=haystack.length();
	    int n=needle.length();
	    if(n>m){
	        return -1;
	    }
	    int j=0;
	    for(int i=0 ;i<m;i++){
	        if(haystack.charAt(i)==needle.charAt(j)){
	            if((i+n<=m) && haystack.substring(i,i+n).equals(needle)){
	                return i;
	            }
	        }
	    }
	    
	    return -1;
	}
}

