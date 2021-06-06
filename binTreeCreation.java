Creating binary tree from given array sorted 
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        if(A==null)
            return null;
        TreeNode temp = new TreeNode(A[0]);
        temp = buildTree(A,0,A.length-1);
        return temp;
    }
    public TreeNode buildTree(int[] A,int start,int end )
    {
        if(start>end)
            return null;
        if(start == end)
        {
            return new TreeNode(A[start]);
        }
        int mid = (start+end)/2;
        TreeNode current = new TreeNode(A[mid]);
        
        current.right  = buildTree(A,mid+1,end);
        current.left = buildTree(A,start,mid-1);
        
        return current;
    }
}