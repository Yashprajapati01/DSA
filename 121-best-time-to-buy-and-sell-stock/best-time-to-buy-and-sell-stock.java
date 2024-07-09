class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int largestDiffence = 0;

        for(int i = 0; i < prices.length; ++i){
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            } else {
                largestDiffence = Math.max(largestDiffence, prices[i] - minSoFar);
            }
        }   
        return largestDiffence;
    }
}