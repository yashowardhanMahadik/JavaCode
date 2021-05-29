    TreeMap<Integer, Integer> A = new TreeMap<Integer, Integer>(); 
    // O(1) declaration which declares an empty tree map.

        A.put(K, V); 
        // Note that we expect key K to be unique here. 
        //If you have keys that will repeat, they will be replaced. 
             // O(log n)

     A.remove(K); // O(log n)
         A.containsKey(K)  // O(log n)
              A.get(K)     // O(log n)

Find minimum key K in the map ( if the map is not empty ) :
     A.firstKey() OR A.firstEntry().getKey()     // O(1)
         A.lastKey() OR A.lastEntry().getKey()     // O(1)

Iterate over keys in sorted order :
             for (Map.Entry<Integer, Integer> entry : A.entrySet()) {
                 entry.getKey() has the key, entry.getValue() has the value
    } 

Find closest key K >= x :
    A.ceilingEntry(x).getKey()     // O(log n). 
    //Do need to handle the case when x is more than the max key in the map.
Find closest key K <= x :
    A.floorEntry(x).getKey()     // O(log n). 
    //Do need to handle the case when x is smaller than min key in the map

     A.size() 

partial Solution
// Approach
// 1. Use TreeMap here to store sums
// 2. return max sums til N-- becomes 0 and save in aList
// 3. return AList
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        TreeMap<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
        int cn=0;
        int sum=0;
        int N = A.size();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                sum = A.get(i)+B.get(j);
                if(!tmap.containsKey(sum))
                {
                    tmap.put(sum,1);
                }
                else
                {
                    tmap.put(sum,tmap.get(sum)+1);
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(N-->0)
    {
        if(tmap.size()>0)
        {
            //System.out.println(tmap.get(tmap.lastKey())+" value     "+tmap.lastKey()+"key");
            //result.add(tmap.pollLastEntry().getValue());
            result.add(tmap.lastKey());
            //tmap.put(tmap.lastKey(),tmap.get(tmap.lastKey())--);
            int jj =tmap.lastEntry().getValue();
            //System.out.println("jj->   "+jj);
            tmap.put(tmap.lastKey(),--jj);
            //System.out.println("laast value->   "+tmap.get(tmap.lastKey()));
            if(tmap.get(tmap.lastKey())<=0)
            {
                
                tmap.pollLastEntry();
            }
            
        }
    }
    return result;
    
}
}