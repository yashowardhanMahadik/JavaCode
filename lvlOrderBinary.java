public class Solution {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        if(A==null)
            return null;
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(A);
        findCousin(A,B,res,que);
        
        return res;
    }
    public void findCousin(TreeNode A,int B,ArrayList<Integer> res,Queue<TreeNode> que)
    {
        int flag = 0;
        while(!que.isEmpty())
        {
            
            int n=que.size();
            if(flag==1)
            {
                for(int i=0;i<n;i++)
                {
                    //System.out.print("-> "+que.peek().val);
                    res.add(que.poll().val);
                }
                break;
            }
            for(int i=0;i<n;i++)
            {
                
                TreeNode temp = que.poll();
                
                if(temp.left!=null && temp.left.val ==B)
                {
                    flag=1;
                    continue;
                }
                  if(temp.right!=null && temp.right.val ==B)
                {
                    flag=1;
                    continue;
                }
                if(temp.left!=null)
                {
                            que.add(temp.left);
                }
                if(temp.right!=null)
                {
                            que.add(temp.right);
                }
               
            }
        }
        
    }
}