public class Solution {
    TreeNode temp,curr;
    public TreeNode flatten(TreeNode a) {
         if (a == null){
		        return null;
		    }
        curr =  new TreeNode(a.val);
        temp = curr;
        flatten2(a.left);
        flatten2(a.right);
        
        return curr;
    }
    public void flatten2(TreeNode A)
    {
        if(A!=null)
        {
         TreeNode k = new TreeNode(A.val);
        //System.out.print(k.val+"->");
         temp.right=k;
        temp=temp.right;
        flatten2(A.left);
        flatten2(A.right);
        }
        //return temp;
    }
}