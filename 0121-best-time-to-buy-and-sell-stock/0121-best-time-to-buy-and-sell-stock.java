class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for (int i = 0; i < prices.length; i++) {
        // for (int j = i+1; j < prices.length; j++) {
        // int diff = prices[j] - prices[i];
        // if (diff>maxProfit) maxProfit = diff;
        // }
        // }
        // return maxProfit;
        // Optimal solution
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}