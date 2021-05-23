// Approach is simple use recursive function
// 1. generate all combinations till limit of length A
// 2. if sum current == the sum break the loop and store it in result Array
// 3. Return result array

public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> C = new ArrayList();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        //result.add(new ArrayList<Integer>());
        if(A==null)
            return result;
        Collections.sort(A);
        //A.stream().distinct().collect(Collectors.toList());
        //using this way we can delete all the duplicates
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(A);

    // delete al elements of arraylist
        A.clear();

    // add element from set to arraylist
        A.addAll(set);
        result = generateSub(result,C,A,0,0,B);
        return result;
    }
    public ArrayList<ArrayList<Integer>> generateSub(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> C, ArrayList<Integer> A, int index, int sum, int B)
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
            generateSub(result,C,A,i,sum,B);//recursion
            //postcondition
            sum -= C.get(C.size()-1);
            C.remove(C.size()-1);
        }
        return result;
    }
}
