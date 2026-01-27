class Solution {
    public int minCost(int n, int[][] edges) {
        int dis[]=new int[n];
        Arrays.fill(dis,(int)1e9);
        dis[0]=0;
        ArrayList<ArrayList<int []>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int []i:edges)
        {
            int u=i[0];
            int v=i[1];
            int w=i[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int []{u,2*w});
        }
        PriorityQueue<int []> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        q.offer(new int[]{0,0});
        while(!q.isEmpty())
        {
            int node=q.peek()[1];
            int d=q.peek()[0];
            q.poll();
            if(d>dis[node])
            continue;
            for(int i[]:adj.get(node))
            {
                int wt=i[1];
                int ne=i[0];
                if(dis[ne]>dis[node]+wt)
                {
                    dis[ne]=dis[node]+wt;
                    q.offer(new int []{dis[ne],ne});
                }
            }

        }
        return dis[n-1]==1e9?-1:dis[n-1];
    }
}