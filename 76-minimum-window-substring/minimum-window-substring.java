class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int l = 0, r = 0;
        int cnt = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) cnt++;
                map.put(ch, map.get(ch) - 1);
            }

            while (cnt == t.length()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char left = s.charAt(l);
                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);
                    if (map.get(left) > 0) cnt--;
                }
                l++;   
            }
            r++;
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}
