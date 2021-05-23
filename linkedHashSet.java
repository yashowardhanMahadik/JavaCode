public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> C = new ArrayList();
        LinkedHashSet<ArrayList<Integer>> result = new LinkedHashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result2 = new ArrayList<ArrayList<Integer>>();
        //result.add(new ArrayList<Integer>());
        if(A==null)
            return result2;
        Collections.sort(A);
        //A.stream().distinct().collect(Collectors.toList());
        //using this way we can delete all the duplicates

        // A.addAll(set);
        result = generateSub(result,C,A,0,0,B);
        //Set<Integer> set = new LinkedHashSet<>();
        //set.addAll(result);

   // delete al elements of arraylist
        //result.clear();

    //add element from set to arraylist
        result2.addAll(result);
        return result2;
    }
    public LinkedHashSet<ArrayList<Integer>> generateSub(LinkedHashSet<ArrayList<Integer>> result,ArrayList<Integer> C, ArrayList<Integer> A, int index, int sum, int B)
    {
        for(int i=index;i<A.size();i++)//looping
        {
            //precondition
            int temp = sum + A.get(i);
            
            if(temp<=B)
            {
                C.add(A.get(i));
                sum+=A.get(i);
                if(temp == B)
                {
                    //System.out.println("Index ->> "+index);
                    result.add(new ArrayList<Integer>(C));
                }
                
            }
            else
            {
                return result;
            }
            generateSub(result,C,A,i+1,sum,B);//recursion
            //postcondition
            sum -= C.get(C.size()-1);
            C.remove(C.size()-1);
        }
        return result;
    }
}