/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {

    TreeNode root;
    Stack<TreeNode> stmin = new Stack<TreeNode>();
    public Solution(TreeNode root) {
        this.root=root;
        TreeNode tnode = root;
        while(tnode!=null)
        {
            stmin.push(tnode);
            tnode = tnode.left;
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(stmin.isEmpty())
            return false;
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stmin.pop();
        int ans = temp.val;
        //System.out.println("ans"+ans);
        temp=temp.right;
        while(temp!=null)
        {
            //ans = temp.val;
            stmin.push(temp);
            temp=temp.left;
        }
        return ans;
        
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
