//>2x
//1st simulate in the mind, change question to easy one, break down the problem
//2nd create a function takes row in account
//3 run for no. of rows and create string list
//4 last append the string list into new and return that
//5 the add logic need to be modified 1 ^2 3 4 5 6 7 ^8 9 ^10 11 12 13 14 15 ^16 17 ^18
//1 2 ^3 4 5 6 ^7 8 9 10 ^11 12 13 14 ^15 16 17 18 ^19
//5 7-> 5_1 ->3_3 -> 1_5 -> 7
//8 13->  
//9 always simulate from ZERO 0 index
public class Solution {
    public String convert(String A, int B) {
        ArrayList<String> al = new ArrayList<String>();
        if(B<=1)
        {
            return A;
        }
        for(int i=0;i<B;i++)
        {
            int next=i;
            int curr=i;
            int bit =1;
            StringBuilder sb = new StringBuilder();
            while(next<A.length())
            {
                curr=next;
                sb.append(A.charAt(curr));
                //next+= B*2 -1;
                if((B-1-i)*2==0 || i*2 ==0)
                {
                    next+= (B-1)*2;
                }
                else
                {
                if(bit==1)
                {
                    next+= (B-1-i)*2;
                    bit=0;
                }
                else
                {
                    next+= (i*2);
                    bit=1;
                }
                }
                
            }
            al.add(sb.toString());
        }
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<B;i++)
        {
            s2.append(al.get(i));
        }
        String neew = s2.toString();
        
        return neew;
    }
}
