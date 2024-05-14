class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minm=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            minm=Math.min(minm,prices[i]);
            int profit=prices[i]-minm;
             maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}