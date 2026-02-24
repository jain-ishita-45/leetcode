class Solution {
    public int scoreDifference(int[] nums) {
        int alice = 0, bob = 0;
        boolean aliceTurn = true;

        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 6 == 0) {
                aliceTurn = !aliceTurn;
            }
            if (nums[i] % 2 == 1) {
                aliceTurn = !aliceTurn;
            }
            if (aliceTurn) {
                alice += nums[i];
            } else {
                bob += nums[i];
            }
        }
        return alice - bob;
    }
}