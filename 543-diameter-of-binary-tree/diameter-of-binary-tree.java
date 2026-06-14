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
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        int left=height(root.left);
        System.out.println(left+" "+root.val);
        int right=height(root.right);
        System.out.println(right+" "+root.val);
        ans=Math.max(ans,left+right);
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int l=height(root);
        return ans;
    }
}