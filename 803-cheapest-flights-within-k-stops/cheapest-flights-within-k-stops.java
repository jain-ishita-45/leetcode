class Pair{
    int first,second;
    Pair(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Tuple{
    int first,second,third;
    Tuple(int first, int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dist[]=new int[n];
        int c=0;
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        int m=flights.length;
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<m;i++)
        adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        Queue<Tuple> q=new LinkedList<>();
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        q.offer(new Tuple(0,src,0));
        while(!q.isEmpty())
        {
            Tuple t=q.poll();
            int stops=t.first;
            int node=t.second;
            int cost=t.third;
            if(stops>k) continue;
            for(Pair iter:adj.get(node))
            {
                int adjn=iter.first;
                int dis=iter.second;
                if(cost+dis<dist[adjn] && stops<=k)
                {
                    q.add(new Tuple(stops+1,adjn,dis+cost));
                    dist[adjn]=dis+cost;
                }


            }
        }
        if(dist[dst]==(int)1e9) return -1;
        return dist[dst];
    }
}