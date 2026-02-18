class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<int []>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        int m=roads.length;
        for(int i=0;i<m;i++)
        {
            adj.get(roads[i][0]).add(new int[]{roads[i][1],roads[i][2]});
            adj.get(roads[i][1]).add(new int[]{roads[i][0],roads[i][2]});

        }
        PriorityQueue<long []>pq=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        long dist[]=new long[n];
        int ways[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dist[i]=Long.MAX_VALUE;
            ways[i]=0;
        }
        ways[0]=1;
        pq.add(new long[]{0,0});
        int mod=(int)1e9+7;
        while(!pq.isEmpty())
        {
            long dis=pq.peek()[0];
            int node=(int)pq.peek()[1];
            pq.poll();
                  if (dis > dist[node]) continue;
            for (int []it:adj.get(node))
            {
                int adjn=it[0];
                int ed=it[1];
                if(dis+ed<dist[adjn])
                {
                    dist[adjn]=dis+ed;
                    pq.offer(new long[]{dis+ed,adjn});
                    ways[adjn]=ways[node];
                }
                else if(dis+ed==dist[adjn])
                {
                    ways[adjn]=(ways[adjn]+ways[node])%mod;
                }
            }
        }
         return ways[n-1]%mod;
    }
}