class Solution {
    public int findMin(int[] arr) {
        int low=0,high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid])
            {
                ans=Math.min(arr[low],ans);
                  low=mid+1;
                
            }
            else if(arr[mid]<=arr[high])
            {
                ans=Math.min(arr[mid],ans);
              high=mid-1;
            }
        }
        return ans;
    }
}