class Solution {
    public int almostPalindromic(String s) {
        int n = s.length(), res = 0;
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                res = Math.max(res, r - l + 2);
                l--; r++;
            }
            int sl = l - 1, sr = r;
            while (sl >= 0 && sr < n && s.charAt(sl) == s.charAt(sr)) {
                res = Math.max(res, sr - sl + 1);
                sl--; sr++;
            }
            sl = l; sr = r + 1;
            while (sl >= 0 && sr < n && s.charAt(sl) == s.charAt(sr)) {
                res = Math.max(res, sr - sl + 1);
                sl--; sr++;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = i, r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                res = Math.max(res, r - l + 2);
                l--; r++;
            }
            int sl = l - 1, sr = r;
            while (sl >= 0 && sr < n && s.charAt(sl) == s.charAt(sr)) {
                res = Math.max(res, sr - sl + 1);
                sl--; sr++;
            }
            sl = l; sr = r + 1;
            while (sl >= 0 && sr < n && s.charAt(sl) == s.charAt(sr)) {
                res = Math.max(res, sr - sl + 1);
                sl--; sr++;
            }
        }
        return Math.min(res, n);
    }
}