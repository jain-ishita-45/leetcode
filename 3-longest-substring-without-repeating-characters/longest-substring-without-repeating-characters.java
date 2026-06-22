class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,n=s.length(),maxlen=0;
        while(r<n)
        {
            if(map.containsKey(s.charAt(r)))
            {
                l=Math.max(l,map.get(s.charAt(r))+1);
                map.put(s.charAt(r),r);
            }
            else
            map.put(s.charAt(r),r);
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}