/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
           
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                 TreeNode node=q.poll();
                if(node.left!=null)
                q.offer(node.left);
                if(node.right!=null)
                q.offer(node.right);
                a.add(node.val);
            }
            ans.add(a);
        }
    
        while(ans.size()!=0)
        result.add(ans.remove(ans.size()-1));
        return result;
    }
}