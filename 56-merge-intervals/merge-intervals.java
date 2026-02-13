class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int []>res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        res.add(new int []{intervals[0][0],intervals[0][1]});
        int n=intervals.length;
        for(int i=1;i<n;i++)
        {
            int cur[]=intervals[i];
            int []last=res.get(res.size()-1);
            if(cur[0]<=last[1])
            last[1]=Math.max(last[1],cur[1]);
            else
            {
                res.add(new int []{cur[0],cur[1]});
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}