class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,area=0;
        while(l<=r)
        {
            int ans=Math.min(height[l],height[r])*(r-l);
            area=Math.max(area,ans);
            if(height[l]>height[r])
            r--;
            else
            l++;
        }
        return area;
    }
}