public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (cur == null) {
                sb.append("#,");
            } else {
                sb.append(cur.val).append(",");
                q.offer(cur.left);
                q.offer(cur.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;

        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            // Left child
            if (!arr[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
                node.left = left;
                q.offer(left);
            }
            i++;

            // Right child
            if (!arr[i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
                node.right = right;
                q.offer(right);
            }
            i++;
        }
        return root;
    }
}