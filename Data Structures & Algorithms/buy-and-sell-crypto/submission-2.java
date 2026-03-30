class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=prices[0];
        int maxprofit=0;
        for(int i=1;i<n;i++)
        {
            int profit=prices[i]-max;
            if(profit>maxprofit)
            {
             maxprofit=profit;
            }
            else if(prices[i]<max)
            {
                max=prices[i];
            }


        }
        return maxprofit;
    
    }
}
