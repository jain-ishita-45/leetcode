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

    public boolean isSym(TreeNode r, TreeNode l)
    {
        if(r==null && l==null) return true;
        if(r==null || l==null) return false;
        if(r.val!=l.val) return false;
        return isSym(l.left,r.right) && isSym(l.right,r.left);
    }
    public boolean isSymmetric(TreeNode root) {
       return root==null ||isSym(root.left,root.right);
        
    }
}