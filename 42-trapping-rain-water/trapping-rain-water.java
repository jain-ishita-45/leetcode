class Solution {
    public int trap(int[] height) {
        int total=0;
        int lmax=height[0],rmax=height[height.length-1],l=0,r=height.length-1;
        while(l<=r)
        {
            if(height[l]<=height[r])
            {
                if(height[l]<=lmax)
                total+=lmax-height[l];
                else
                lmax=height[l];
                l++;
            }
            else
            {
                if(height[r]<=rmax)
                total+=rmax-height[r];
                else
                rmax=height[r];
                r--;
            }
        }
        return total;
    }
}