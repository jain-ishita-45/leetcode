class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
        for(int e[]:prerequisites)
        {
            adj.get(e[1]).add(e[0]);
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
        int j=0;
        int [] ans=new int[numCourses];
        while(!q.isEmpty())
        {
            int node=q.poll();
            ans[j++]=node;
            for(int e:adj.get(node))
            {
                indegree[e]--;
                if(indegree[e]==0)
                q.offer(e);
            }
        }
        
        if(j!=numCourses) return new int[0];
       
        return ans;
        
    }
}