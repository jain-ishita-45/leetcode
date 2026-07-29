class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int []>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int e[]:flights)
        {
            adj.get(e[0]).add(new int[]{e[1],e[2]});
        }
        int dist[]=new int[n];
        Arrays.fill(dist,100000);
        dist[src]=0;
        Queue<int []> q=new LinkedList<>();
        q.offer(new int[]{0,src,0});
        while(!q.isEmpty())
        {
            int []row=q.poll();
            int stop=row[0];
            int node=row[1];
            int cost=row[2];
            if(stop>k) return (dist[dst]!=100000?dist[dst]:-1);
            for(int []v:adj.get(node))
            {
                int u=v[0],x=v[1];
                if((cost+x)<dist[u] && stop<=k)
                {
                    dist[u]=cost+x;
                    q.offer(new int[]{stop+1,u,dist[u]});
                }
            }
        }
        if(dist[dst]==100000) return -1;
        return dist[dst];
        
    }
}