class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=x;
        int res=0;
        while(x>0)
        {
            int digit=x%10;
            res=res*10+digit;
            x=x/10;
        }
        if(y==res)
        return true;
        return false;
    }
}