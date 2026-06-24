class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
        for(int []x:prerequisites)
        adj.get(x[0]).add(x[1]);
        for(int i=0;i<numCourses;i++)
        {
            for(int x:adj.get(i))
            indegree[x]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            int x=q.poll();
            ans.add(x);
            for(int i:adj.get(x))
            {
                indegree[i]--;
                if(indegree[i]==0)
                q.offer(i);
            }
        }
        if(ans.size()==numCourses) return true;
        return false;

    }
}