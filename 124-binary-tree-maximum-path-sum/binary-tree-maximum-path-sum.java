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
       int ans=Integer.MIN_VALUE;
    public int max(TreeNode root)
    {
     
        if(root==null) return 0;
        int val=root.val;
        int v1=0,v2=0;
        if(root.left!=null)
         v1=Math.max(0,max(root.left));
        if(root.right!=null)
        v2=Math.max(max(root.right),0);
        ans=Math.max(ans,v1+v2+val);
        return Math.max(v1,v2)+val;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        max(root);
        return ans;
    }
}
