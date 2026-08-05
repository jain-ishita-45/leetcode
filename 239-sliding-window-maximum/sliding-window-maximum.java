import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Maintain decreasing order
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Add answer when window is valid
            if (i >= k - 1) {
                list.add(nums[dq.peekFirst()]);
            }
        }

        // Convert list to array
        int[] ans = new int[list.size()];
        int idx = 0;
        for (int val : list) {
            ans[idx++] = val;
        }

        return ans;
    }
}