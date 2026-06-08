class Solution {
    public int maxProfit(int[] prices) {
        int cost=prices[0],profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int cc=prices[i]-cost;
            profit=Math.max(profit,cc);
            cost=Math.min(cost,prices[i]);
        }
        return profit;
    }
}