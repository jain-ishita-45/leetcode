class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<points.length;i++)
        {
            int ans=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            pq.offer(new int[]{ans,points[i][0],points[i][1]});
        }
        int [][]result=new int[k][2];
        for(int i=0;i<k;i++)
        {
            result[i][0]=pq.peek()[1];
            result[i][1]=pq.peek()[2];
            pq.poll();
        }
        return result;
    }
}