class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int []> ans=new ArrayList<>();
        int  n=intervals.length,i=0;
        while(i<n && intervals[i][1]<newInterval[0])
        {
            ans.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        int start=newInterval[0], end=newInterval[1];
        while(i<n && intervals[i][0]<=end)
        {
            start=Math.min(intervals[i][0],start);
            end=Math.max(intervals[i][1],end);
            i++;
        }
        ans.add(new int[]{start,end});
        while(i<n)
        {
            ans.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}