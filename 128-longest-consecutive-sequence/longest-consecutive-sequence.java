class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        HashSet<Integer> set=new HashSet<>();
        int c=1,max=1;
        for(int i:nums)
        set.add(i);
        for(int i:set)
        {
            if(set.contains(i-1)) continue;
            int x=i;
            while(set.contains(x+1))
            {
                c++;
                x=x+1;
            }
            max=Math.max(c,max);
            c=1;
        }
        return max;
    }
}