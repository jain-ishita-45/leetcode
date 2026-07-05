class Solution {

    public boolean check(int i, String s, String p)
    {
        int freq[]=new int [26];
        for(int j=i;j<i+p.length();j++)
        {
            freq[s.charAt(j)-'a']++;
            
        }
        for(int j=0;j<p.length();j++)
        freq[p.charAt(j)-'a']--;

        for(int j=0;j<26;j++)
        {
            if(freq[j]!=0) return false;

        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            if(check(i,s,p)==true)
            ans.add(i);
        }
        return ans;
    }
}