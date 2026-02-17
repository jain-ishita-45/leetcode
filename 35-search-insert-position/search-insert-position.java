class Solution {
    public int searchInsert(int[] arr, int target) {
        if(arr[0]>target) return 0;
        if(arr[arr.length-1]<target) return arr.length;
        int low=0, high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target)
            {
                high=mid-1;
            ans=mid;
            }
            else
            low=mid+1;

        }
        return ans;
    }
}