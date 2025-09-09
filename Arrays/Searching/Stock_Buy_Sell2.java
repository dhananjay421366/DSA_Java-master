public class Stock_Buy_Sell2 {
    public static int Stock_Buy_Sell2(int prices[]) {
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrices < prices[i]) { // profit
                int profit = prices[i] - buyPrices; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrices = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Stock_Buy_Sell2(prices));

    }
}
