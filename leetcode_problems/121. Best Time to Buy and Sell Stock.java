class Solution {
    public int maxProfit(int[] prices) {
        int low=Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0;i<prices.length;i++){
            if(prices[i]>low){
                int curr = prices[i]-low;
                max=Math.max(curr,max);
            }else{
                low = prices[i];
            }
        }
        return max;
    }
}