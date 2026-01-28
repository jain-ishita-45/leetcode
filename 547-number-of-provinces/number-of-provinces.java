class Solution {

        
    static void bfs(int v,int vis[],ArrayList<ArrayList<Integer>> adj )
    {
        vis[v]=1;
        Queue<Integer> q=new LinkedList<>();
        q.offer(v);
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int x:adj.get(node))
            {
                if(vis[x]!=1)
                {
                    vis[x]=1;
                    q.offer(x);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
          int vis[]=new int[V];
        int c=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        adj.add(new ArrayList<>());
       for (int i = 0; i < V; i++) {
    for (int j = 0; j < V; j++) {
        if (isConnected[i][j] == 1 && i != j) {
            adj.get(i).add(j);
            adj.get(j).add(i);
        }
    }
}
        for(int i=0;i<V;i++)
        {
            if(vis[i]!=1)
            {
                bfs(i,vis,adj);
                c++;
            }
        }
        return c;
    
    }
}