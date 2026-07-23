class Solution {
    public int maxProfit(int[] prices) {
        //Two pointers
        //Find the highsest difference
        //Store
        int max = 0;

        //Two fors exceed time limit. Gotta do it one pass I think
        if(prices.length == 1) {
            return max;
        }

        for(int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1]) {
                max += prices[i+1] - prices[i];
            }
        }

        return max;
    }
}