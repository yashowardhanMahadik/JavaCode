M1
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode temp = A;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.left;
        }
        while(!st.isEmpty())
        {
            TreeNode tn = st.pop();
            ans.add(tn.val);
            tn = tn.right;
            while(tn!=null)
            {
                st.push(tn);
                tn = tn.left;
            }
        }
        return ans;}}
M2
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode temp = A;
        TreeNode tn = A;
        st.push(A);
        while(!st.isEmpty())   // ||tn!=null) or add this without initializing stack on line 33, 46
        {
            while(tn!=null)
            {
                st.push(tn);
                tn = tn.left;
            }
            
            tn = st.pop();
            ans.add(tn.val);
            tn = tn.right;
        }
        ans.remove(ans.size()-1);
        return ans;
        
    }
}