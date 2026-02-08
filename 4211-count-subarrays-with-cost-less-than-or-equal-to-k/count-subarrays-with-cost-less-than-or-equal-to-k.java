class Solution {
    public long countSubarrays(int[] nums, long k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int i = 0;
        long ans = 0;

        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (!map.isEmpty() &&
                   (long)(map.lastKey() - map.firstKey()) * (j - i + 1) > k) {

                int val = nums[i];
                map.put(val, map.get(val) - 1);
                if (map.get(val) == 0) map.remove(val);
                i++;
            }

            ans += (j - i + 1);
        }

        return ans;
    }
}
