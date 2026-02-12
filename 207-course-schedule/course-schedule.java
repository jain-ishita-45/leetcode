class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
        for(int e[]:prerequisites)
        {
            adj.get(e[0]).add(e[1]);
        }
        for(int i=0;i<numCourses;i++)
        {
            for(int e:adj.get(i))
            indegree[e]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
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
        if(ans.size()==numCourses)
        return true;
        return false;

    }
}