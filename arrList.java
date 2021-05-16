//>2
//approach
//merge sort implimentation
// int val1 = a.get(ptr1).intValue();
 //           int val2 = b.get(ptr2).intValue();
 /*
 public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        //int[] arr1 = a.stream().mapToInt(i->i).toArray();
        //int[] arr2 = b.stream().mapToInt(i->i).toArray();
        
        int ptr1 = 0, ptr2 = 0;
        int len1 = a.size(), len2 = b.size();
        
        while(ptr1<len1 && ptr2<len2){
            int val1 = a.get(ptr1).intValue();
            int val2 = b.get(ptr2).intValue();
            
            if(val1<=val2){
                ptr1++;
            }else{
                a.add( ptr1++, val2);
                ++ptr2;
                ++len1;
            }
        }
        
        
        if(ptr2!=len2){
            while(ptr2<len2){
                a.add(ptr1++, b.get(ptr2++));
            }
        }
    }
}
*/
 
public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int asize=a.size();
        int bsize=b.size();
        int i=0,j=0;
        int maxi = a;
        a.sort();
        while(i<asize && j<bsize)
        {
            if(a.get(i).intValue()>=b.get(j).intValue())
            {
                a.add(i,b.get(j));
                j++;
                i++;asize++;
                //
                a.remove();
                a.set(i,element);
            }
            else
                i++;
        }
        while(j<bsize)
        {
            a.add(b.get(j));
            j++;
        }
        //return a;
    }
}

