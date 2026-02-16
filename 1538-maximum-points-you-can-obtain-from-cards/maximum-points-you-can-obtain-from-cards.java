class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum=0,lsum=0;
        for(int i=0;i<k;i++)
        {
            lsum+=cardPoints[i];
            
        }
        maxsum=lsum;
        int rsum=0,r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum-=cardPoints[i];
            rsum+=cardPoints[r];
            r--;
            maxsum=Math.max(maxsum,lsum+rsum);

        }
        return maxsum;

    }
}