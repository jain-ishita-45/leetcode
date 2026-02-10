class Solution {
    public int longestBalanced(int[] nums) {
        int maxlength=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> odd=new HashSet<>();
            HashSet<Integer> even=new HashSet<>();
            if(n-i<=maxlength)break;
            for(int j=i;j<n;j++)
            {
                if(nums[j]%2==0)
                even.add(nums[j]);
                else
                odd.add(nums[j]);
                if(odd.size()==even.size())
                maxlength=Math.max(maxlength,j-i+1);
            }
        }
        return maxlength;
    }
}