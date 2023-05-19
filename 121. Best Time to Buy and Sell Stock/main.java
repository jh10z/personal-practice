class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buy = prices[0];
        
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            }
            else {
                if(prices[i] - buy > result) {
                    result = prices[i] - buy;
                }
            }
        }
        
        return result;
    }
}