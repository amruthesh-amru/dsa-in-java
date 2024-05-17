public class bestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int profit = 0;
        int mini = prices[0];

        for(int i=0;i<prices.length;i++){
            int cost = prices[i]-mini;
            profit = Math.max(cost,profit);
            mini = Math.min(prices[i],mini);
        }
        System.out.println(profit);
//        brute force -> O(n^2)
//        int profit = 0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[j]-prices[i]>profit){
//                    profit = prices[j]-prices[i];
//                }
//            }
//        }
//        System.out.println(profit);
    }
}
