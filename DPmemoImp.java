public class Solution {
    public ArrayList<String> wordBreak(String A, ArrayList<String> B) {
        // String aaaa= "sachin";
        // System.out.println(aaaa.substring(6)+"<----");
        ArrayList<String> result = new ArrayList<>();
        HashSet<String> hset = new HashSet<>();
        Collections.sort(B);
        // result.add(new String("asa"));
        wordBreaking(A,B,result,"",hset);
        // if(result.size() == 0))
        //     result.add(new String());
     return result;
    }
    public void wordBreaking(String A, ArrayList<String> B
    , ArrayList<String> result, String resStr
    ,HashSet<String> hset) {
        if(hset.contains(resStr))
            return ;
        if(A.length()==0)
        {
            // System.out.println(resStr.substring(1)+"added ");
            result.add(resStr.substring(1));
            // hmap.add(resStr);
            hset.add(resStr);
            return ;
        }
        for(String ss : B)
        {
            
            // System.out.println(ss+" ss    resstring-> "+resStr+"  A= "+A);
            if(!A.isEmpty() && ss.length() <= A.length() &&
            ss.equals(A.substring(0,ss.length())))
            {
                //result.add(new String(ss));
                resStr = new String(resStr+" "+ss);
                wordBreaking(A.substring(ss.length()),B,result,resStr,hset);
                resStr = new String(resStr.substring(0,resStr.length()-ss.length()-1));
            }
        }
        // hset.add(A);
        return ;
    }
}