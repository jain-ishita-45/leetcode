class Solution {
    public int factorial(int digit)
    {
        int ans=1;
        for(int i=1;i<=digit;i++)
        ans*=i;
        return ans;
    }
    public boolean isDigitorialPermutation(int n) {
        int ans=0,digit=0,x=n;
        while(n>0)
        {
            digit=n%10;
            ans+=factorial(digit);
            n=n/10;

        }
        return isPermutation(x, ans);
    }

    private boolean isPermutation(int a, int b) {
        char[] x = String.valueOf(a).toCharArray();
        char[] y = String.valueOf(b).toCharArray();

        if (x.length != y.length) return false;

        java.util.Arrays.sort(x);
        java.util.Arrays.sort(y);

        return java.util.Arrays.equals(x, y);
    }
}