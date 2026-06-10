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
    int ans=0;

    public int isBalance(TreeNode root)
    {
        if(root== null) return 0;
        int left=1+isBalance(root.left);
        int right=1+isBalance(root.right);
        ans=Math.max(ans,Math.abs(left-right));
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        
        int a=isBalance(root);
        return ans<=1;

        
    }
}