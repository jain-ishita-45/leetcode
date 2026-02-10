class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            if(e.getValue()>nums.length/3)
            ans.add(e.getKey());
        }
        return ans;
    }
}