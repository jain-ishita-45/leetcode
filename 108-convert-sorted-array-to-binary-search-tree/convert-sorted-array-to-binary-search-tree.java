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

    public TreeNode convert(int []nums, int lleft,int rright)
    {
        if(lleft>rright) return null;
        int mid=lleft+(rright-lleft)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=convert(nums,lleft,mid-1);
        node.right=convert(nums,mid+1,rright);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0, nums.length-1);
        
    }
}