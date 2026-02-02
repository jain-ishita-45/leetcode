class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return build(inorder, 0, inorder.length - 1,
                     postorder, 0, postorder.length - 1,
                     inMap);
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd,
                          int[] postorder, int postStart, int postEnd,
                          Map<Integer, Integer> inMap) {

        if (inStart > inEnd || postStart > postEnd) return null;

        // Root comes from postorder's last element
        TreeNode root = new TreeNode(postorder[postEnd]);

        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        // Build left and right subtrees
        root.left = build(inorder, inStart, inRoot - 1,
                          postorder, postStart, postStart + numsLeft - 1,
                          inMap);

        root.right = build(inorder, inRoot + 1, inEnd,
                           postorder, postStart + numsLeft, postEnd - 1,
                           inMap);

        return root;
    }
}
