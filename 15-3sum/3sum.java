class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
             HashSet<Integer> st=new HashSet<>();
             for(int j=i+1;j<nums.length;j++)
             {
                int sec=-nums[i]-nums[j];
                
                if(st.contains(sec))
                {
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(sec);
                      ans.add(temp);
                      while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
                }
              
                st.add(nums[j]);
             }
        }
        return ans;
    }
}