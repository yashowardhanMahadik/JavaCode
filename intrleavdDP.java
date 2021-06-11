public class Solution {
    public int isInterleave(String A, String B, String C) {
        HashMap<String,Integer> hmap = new HashMap<>();
        return isInterleaved(A,B,C,hmap);
        
    }
    public int isInterleaved(String A, String B, String C,HashMap<String,Integer> hmap)
    {
        
        if(C.length()==0 && A.length()==0 && B.length()==0)
        {
            return 1;
        }
        if(C.length()==0)
        {
            return 0;
        }
        String key = A+"|"+B+"|"+C;
        if(hmap.containsKey(key))
            return hmap.get(key);
        int a=0,b=0;
        if(!A.isEmpty()&&A.charAt(0)==C.charAt(0))
            a=isInterleaved(A.substring(1),B,C.substring(1),hmap);
        if(!B.isEmpty()&&B.charAt(0)==C.charAt(0))
            b=isInterleaved(A,B.substring(1),C.substring(1),hmap);
        if(a==1 || b==1)
        {   hmap.put(key,1);
            return 1;
        }
        hmap.put(key,0);
        return 0;
    }
}