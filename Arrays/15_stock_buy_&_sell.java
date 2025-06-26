// LeetCode 121: Stock Buy And Sell

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int minInteger = prices[0];

        for(int i=1; i<n; i++){
            if(prices[i]<minInteger){
                minInteger = prices[i];
            }
            else{
                max = Math.max(max,prices[i]-minInteger);
            }
        }
        return max;
    }
}


//-----------My First Method----------------

class Solution1 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int stock = 0;
        int max = 0;
        int BuyAt = -1;
        int i=0;

        while(i<n-1)
        {
            if(stock==0 && prices[i]<prices[i+1]){
                stock = 1;
                BuyAt = i;
            }
            else if(stock==1){
                max = Math.max(max,prices[i]-prices[BuyAt]);
            }
            if(stock==1 && prices[BuyAt]>prices[i]){
                BuyAt = i;
            }
            i++;
        }
        if(stock == 1 && i == n-1 ){
            max = Math.max(max,prices[n-1] - prices[BuyAt]);
        }
        return max;
    }
}
