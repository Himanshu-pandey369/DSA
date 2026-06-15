public class BestBuyAndSell {
    int BestBuyAndSell(int[] prices){
        int i,maxProfit=0,bestBuy=prices[0];
        for(i=1;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
            }
            bestBuy=Math.min(prices[i], bestBuy);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestBuyAndSell obj = new BestBuyAndSell();
        int[] nums = {7,1,3,5,6,4};
        int result = obj.BestBuyAndSell(nums);
        System.out.println("Maximum profit: " + result);
    }
}
