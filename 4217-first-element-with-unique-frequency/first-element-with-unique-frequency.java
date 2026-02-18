class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
          HashMap<Integer,Integer>mp=new HashMap<>();
       for(int f:map.values())
       mp.put(f,mp.getOrDefault(f,0)+1);
       for (int c:nums)
       {
        if(mp.get(map.get(c))==1)
        return c;
       }
        return -1;
    }
}