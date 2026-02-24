class Solution {

    public int dfs(TreeNode root, int curr) {
        if (root == null) return 0;

        curr = (curr << 1) | root.val; // build binary number

        // Leaf node
        if (root.left == null && root.right == null) {
            return curr;
        }

        return dfs(root.left, curr) + dfs(root.right, curr);
    }

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
}