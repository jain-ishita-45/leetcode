class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                HashSet<Long> st=new HashSet<>();
                for(int k=j+1;k<nums.length;k++)
                {
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long rem=(int)target-sum;
                    if(st.contains(rem))
                    {
                        List<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)rem);
                        if(!ans.contains(temp))
                        ans.add(temp);
                    }
                    st.add((long)nums[k]);
                    
                }
            }
        }
        return ans;
    }
}