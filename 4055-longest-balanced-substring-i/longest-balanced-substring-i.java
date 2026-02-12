class Solution {
    public int longestBalanced(String s) {
        int n=s.length(),maxlen=0;
        for(int i=0;i<n;i++)
        {
            int []freq=new int[26];
            int distict=0,maxfreq=0;
            for(int j=i;j<n;j++)
            {
                int idx=s.charAt(j)-'a';
                if(freq[idx]==0)
                distict++;
                freq[idx]++;
                maxfreq=Math.max(maxfreq,freq[idx]);
                int len=j-i+1;
                if(maxfreq*distict==len)
                maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
}