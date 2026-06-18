class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        for(String i:strs)
        System.out.println(i);
        String ans="";
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        int x=Math.min(strs[strs.length-1].length(),strs[0].length());
        for(int i=0;i<x;i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            ans+=strs[0].charAt(i);
            else
            break;
        }
        return ans;
    }
}