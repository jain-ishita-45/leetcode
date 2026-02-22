class Solution {
    public int divide(int dividend, int divisor) {

        // Only overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (divisor == 0)
            return Integer.MAX_VALUE;

        boolean sign = (dividend >= 0) == (divisor >= 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {
            int c = 0;
            while (n >= (d << (c + 1))) {
                c++;
            }
            ans += (1L << c);
            n -= (d << c);
        }

        return sign ? (int) ans : (int) -ans;
    }
}