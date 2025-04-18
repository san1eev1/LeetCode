class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int low = prices[0];
        int profit=0;
        for(int i=1; i<prices.length; i++)
        {
            if(low > prices[i])
            {
                low = prices[i];
            }
            profit = Math.max(profit, prices[i]-low);
        }
        return profit;
    }
}