class Solution {
    public int maxProfit(int[] prices) {
        int currMinBuy=Integer.MAX_VALUE;
        int currMaxProf=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            currMinBuy=Math.min(currMinBuy,prices[i]);
            currMaxProf=Math.max(currMaxProf,prices[i]-currMinBuy);
        }
        return currMaxProf;
    }
}