class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length, m = nums2.length;

        long[][] dp = new long[k + 1][m + 1];

        for (int i = 0; i <= k; i++)
            Arrays.fill(dp[i], Long.MIN_VALUE);

        // base case
        for (int j = 0; j <= m; j++)
            dp[0][j] = 0;

        for (int i = 1; i <= n; i++) {
            for (int t = Math.min(i, k); t >= 1; t--) {
                for (int j = 1; j <= m; j++) {
                    // skip nums2[j-1]
                    dp[t][j] = Math.max(dp[t][j], dp[t][j - 1]);

                    // take pair
                    if (dp[t - 1][j - 1] != Long.MIN_VALUE) {
                        dp[t][j] = Math.max(
                            dp[t][j],
                            dp[t - 1][j - 1] + 1L * nums1[i - 1] * nums2[j - 1]
                        );
                    }
                }
            }
        }

        return dp[k][m];
    }
}
