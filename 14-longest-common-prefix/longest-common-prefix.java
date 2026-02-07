class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length-1;
        int i=0;
        Arrays.sort(strs);
        StringBuilder s=new StringBuilder();
        while (i<strs[0].length() && i< strs[n].length())
        {
            if(strs[0].charAt(i)==strs[n].charAt(i))
            {
                s.append(strs[0].charAt(i));
                i++;
            }
            else
            break;
        }
        return s.toString();
    }
}