class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(nums,0,res);
        return res;
    }

    public void helper(int []nums,int i,List<List<Integer>> res )
    {
        if(i==nums.length)
        {
            List<Integer> p=new ArrayList<>();
            for(int num: nums)
            p.add(num);
            res.add(p);
            return ;
        }
        for(int j=i;j< nums.length;j++)
        {
            swap(nums,i,j);
            helper(nums,i+1,res);
            swap(nums,i,j);
        }
    }

    public void swap(int nums[], int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}