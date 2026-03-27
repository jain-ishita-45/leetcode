class Solution {
    public long subArrayRanges(int[] nums) {
     return sumOfMax(nums)-sumOfMin(nums);   
    }
     private long sumOfMax(int[] nums) {
        long sum = 0;
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] < (i == n ? Integer.MAX_VALUE : nums[i]))) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (mid - left) * (long)(right - mid);
                sum += nums[mid] * count;
            }
            st.push(i);
        }
        return sum;
    }

    // Helper to calculate sum of all subarrays where nums[i] is min
    private long sumOfMin(int[] nums) {
        long sum = 0;
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || nums[st.peek()] > (i == n ? Integer.MIN_VALUE : nums[i]))) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (mid - left) * (long)(right - mid);
                sum += nums[mid] * count;
            }
            st.push(i);
        }
        return sum;
    }

}