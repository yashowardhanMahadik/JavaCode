/*Approach 
Evaluate Postfix expression
create stack and push num values
if operator appears, pop top2 and evaluate and push back
check also if 2nd pop should not be empty end case
if yes return last pop
else continue*/
public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> st = new Stack();
         int res = 9999;
        for(int i=0;i<A.size();i++)
        {
            String aa = A.get(i);
            boolean numeric = true;
            numeric = aa.matches("-?\\d+(\\.\\d+)?");
            if(numeric)
            {
                st.push(Integer.parseInt(aa));
                // System.out.println("push - >   "+st.peek());
            }
            else
            {
                // System.out.println("pop - >   "+st.peek());
                int b = st.pop();
               
                if(st.isEmpty())
                {
                    return b;
                }
                // System.out.println("pop2   - >   "+st.peek());
                int a = st.pop();
                // System.out.println("Operator value - >   "+aa);
                if(aa.charAt(0) == '*')
                {
                    res = a*b;
                }
                if(aa.charAt(0) == '/')
                {
                    res = a/b;
                }
                if(aa.charAt(0) == '+')
                {
                    res = a+b;
                }
                if(aa.charAt(0) == '-')
                {
                    res = a-b;
                }
                
                st.push(res);
                // System.out.println("push   2   - >   "+st.peek());
            }
        }
        return st.pop();
    }
}