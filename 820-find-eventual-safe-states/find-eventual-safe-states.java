class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       int indegree[]=new int[graph.length];
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
       for(int i=0;i<graph.length;i++)
       adj.add(new ArrayList<>());
        for(int i=0;i<graph.length;i++)
        {
            for(int e:graph[i])
            {
            adj.get(e).add(i);
            indegree[i]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:q)
        System.out.println(i);
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans.add(node);
            for(int e:adj.get(node))
            {
                indegree[e]--;
                if(indegree[e]==0)
                q.offer(e);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}