class Solution {
    public int longestPalindrome(String s) {
        Set<Character> ch=new HashSet<>();
        int res=0;
        for(char c:s.toCharArray())
        {
            if(ch.contains(c))
            {
                ch.remove(c);
                res+=2;
            }
            else
            ch.add(c);
        }
        if(!ch.isEmpty()) res++;
        return res;
    }
}