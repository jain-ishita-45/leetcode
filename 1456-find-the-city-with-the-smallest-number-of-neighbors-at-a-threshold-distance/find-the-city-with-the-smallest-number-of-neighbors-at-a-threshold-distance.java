class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][]=new int[n][n];
        for(int i[]:dist)
        Arrays.fill(i,(int)1e9);
        for(int e[]:edges)
        {
            int u=e[0];
            int v=e[1];
            int wt=e[2];
            dist[u][v]=dist[v][u]=wt;
        }
        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && dist[i][j]<=distanceThreshold)
                adj.get(i).add(j);
            }
        }
        int index=-1;
        System.out.print(adj);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(min>=adj.get(i).size())
            {min=adj.get(i).size();
            index=i;
            }
        }
        return index;

    }
}