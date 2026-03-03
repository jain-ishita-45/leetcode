class Solution {

    public String say(String s)
    {
        if(s.length()==0) return "1";
        String ans="";
        int len=s.length();
for(int i=0;i<len;i++)
{
    int cnt=1;
    while(i<len-1 && s.charAt(i)==s.charAt(i+1))
    {
        i++;
        cnt++;
    }
    ans+=cnt;
    ans+=s.charAt(i);

}
return ans;
    }
    public String countAndSay(int n) {
         String ans = "1";   // Start from first term
        
        for(int i=1; i<n; i++)   // Generate next terms
        {
            ans = say(ans);
        }
        
        return ans;
    }
}