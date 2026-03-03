class Solution {
    public char findKthBit(int n, int k) {
        if(n==1) return '0';
        int len=(1<<n)-1;
        int mid=(len+1)/2;
        if(mid==k) return '1';
        else if(k<mid)
        return findKthBit(n-1,k);
        else
        {
            char bit=findKthBit(n-1,len+1-k);
            if(bit=='1') return '0';
            else
            return '1';
        }
        
    }
}