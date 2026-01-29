class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums)
        mp.put(i,mp.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer>e:mp.entrySet())
        {
            if(e.getValue()>n/2)
            return e.getKey();
        }
        return -1;
    }
}