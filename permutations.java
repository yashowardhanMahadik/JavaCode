//for this all the entries should be unique
// if entries are not unique the use LinkedHashSet type on result
public class Solution {
    int aa = 0;
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        aa = A.size();
        generatePermute(result,A,B,0);
        return result;
        
    }
    public void generatePermute(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> A,ArrayList<Integer> B,int index)
    {
        if(B.size()>=aa)
        {
            result.add(new ArrayList(B));
        }
        
        for(int i=0;i<A.size();i++)
        {
            
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(A);
            B.add(A.get(i));
            //result.add(new ArrayList(B));
            temp.remove(i);
            generatePermute(result,temp,B,0);
            B.remove(B.size()-1);
        }
        return;
    }
}
