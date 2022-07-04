class Solution {
    public int maxProfit(int[] prices) {
        // keep 2 variables min-price and max-profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // traverse prices array and calculate profit whenever a new minPrice is found
        for(int price: prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        
        return maxProfit;
    }
}