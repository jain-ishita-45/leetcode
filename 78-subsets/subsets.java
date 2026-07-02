class Solution {

    public void subset(int []nums, int i, List<Integer> result, List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(result));
            return;
        }
        result.add(nums[i]);
        subset(nums,i+1,result,ans);
        result.remove(result.size()-1);
        subset(nums,i+1,result,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        subset(nums,0,result,ans);
        return ans;
    }
}