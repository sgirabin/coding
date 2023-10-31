class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length<2) {
            return 0;
        }
        
        int profit = 0;
        int buy = prices[0];
        for (int i=1;i<prices.length;i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i]-buy);
        }
        
        return profit;
    }
}
