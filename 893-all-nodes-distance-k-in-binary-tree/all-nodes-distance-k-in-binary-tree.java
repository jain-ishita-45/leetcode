/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void markparent(TreeNode root,HashMap<TreeNode,TreeNode>p)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode cur=q.poll();
            if(cur.left!=null)
            {
                p.put(cur.left,cur);
                q.offer(cur.left);
            }
            if(cur.right!=null)
            {
                p.put(cur.right,cur);
                q.offer(cur.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> p=new HashMap<>();
        markparent(root,p);
        Map<TreeNode,Boolean> vis=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        vis.put(target,true);
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(level==k) break;
            level++;
            for(int i=1;i<=size;i++)
            {
                TreeNode cur=q.poll();
                if(cur.left!=null && vis.get(cur.left)==null)
                {
                    q.offer(cur.left);
                    vis.put(cur.left,true);
                }
                if(cur.right!=null && vis.get(cur.right)==null)
                {
                    q.offer(cur.right);
                    vis.put(cur.right,true);
                }
                if(p.get(cur)!=null && vis.get(p.get(cur))==null)
                {
                    q.offer(p.get(cur));
                    vis.put(p.get(cur),true);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        ans.add(q.poll().val);
        return ans;
    }
}