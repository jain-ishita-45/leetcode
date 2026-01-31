import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        int required = targetFreq.size();
        int formed = 0;

        Map<Character, Integer> windowCounts = new HashMap<>();
        int l = 0, r = 0;
        int[] ans = {-1, 0, 0}; // length, left, right

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (targetFreq.containsKey(c) && windowCounts.get(c).intValue() == targetFreq.get(c).intValue()) {
                formed++;
            }

            // Try to shrink window from left
            while (l <= r && formed == required) {
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                char leftChar = s.charAt(l);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (targetFreq.containsKey(leftChar) && windowCounts.get(leftChar).intValue() < targetFreq.get(leftChar).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}

