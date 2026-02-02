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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> in=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        in.put(inorder[i],i);
        TreeNode root=builde(preorder,0,preorder.length-1,inorder,0,inorder.length-1,in);
        return root;

    }

    public TreeNode builde(int[] preorder,int prestart,int preend,int[]inorder,int instart,int inend,Map<Integer,Integer>in )
    {
        if(prestart>preend|| instart>inend)
        return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=in.get(root.val);
        int numsleft=inroot-instart;
        root.left=builde(preorder,prestart+1,prestart+numsleft,inorder,instart,inroot-1,in);
        root.right=builde(preorder,prestart+1+numsleft,preend,inorder,inroot+1,inend,in);
        return root;
    }
}