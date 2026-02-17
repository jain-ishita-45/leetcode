class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int []>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        adj.add(new ArrayList<>());
        int m=times.length;
        for(int i=0;i<m;i++)
        adj.get(times[i][0]).add(new int []{times[i][1],times[i][2]});
        int dist[]=new int[n+1];
        Arrays.fill(dist,(int)1e9);
        dist[k]=0;
        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        q.offer(new int[]{k,0});
        while(!q.isEmpty())
        {
            int node=q.peek()[0];
            int cost=q.peek()[1];
            q.poll();
            for(int []k1:adj.get(node))
            {
                int n1=k1[0];
                int time=k1[1];
                if((time+cost)<dist[n1])
                {
                    dist[n1]=time+cost;
                    q.offer(new int[]{n1,time+cost});
                }
            }
        }
        for(int i:dist)
        System.out.println(i);
        int max=-1;
        for(int i=1;i<=n;i++)
        {
            max=Math.max(max,dist[i]);
        }
        if(max==(int)1e9)return -1;
        return max;
    }
}