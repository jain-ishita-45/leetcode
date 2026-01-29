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
 class BSTIterator{
    Stack<TreeNode> st=new Stack<>();
   boolean reverse=true;

    BSTIterator(TreeNode root, boolean isreverse)
    {
        reverse=isreverse;
        pushall(root);

    }

    boolean hasnext()
    {
        return st.isEmpty();
    }

    int next()
    {
        TreeNode top=st.pop();
        if(reverse==false)
        pushall(top.right);
        else
        pushall(top.left);
        return top.val;
    }

    void pushall(TreeNode node)
    {
        while(node!=null)
        {
            st.push(node);
            if(reverse==true)
            node=node.right;
            else
            node=node.left;
        }
    }
 }
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root==null) return false;
         BSTIterator l=new  BSTIterator(root,false);
          BSTIterator r=new  BSTIterator(root,true);
          int i=l.next();
          int j=r.next();
          while(i<j)
          {
            if(i+j==k) return true;
            else if(i+j<k)
            i=l.next();
            else
            j=r.next();
          }
          return false;
    }
}