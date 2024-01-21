import java.util.*;

public class program_BUY_And_SELL_Stocks {
    public int BuyAndSellStocks(int[] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) // buyprice < sellprice ... here sellprice is arr[i]
            {
                int profit = arr[i] - buyPrice; // today profit
                maxprofit = Math.max(maxprofit, profit); // global profit
            } else {
                buyPrice = arr[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price number of price in stock:");
        int n = sc.nextInt();
        System.out.println("Enter the price value of stocks:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        program_BUY_And_SELL_Stocks obj = new program_BUY_And_SELL_Stocks();
        System.out.println(obj.BuyAndSellStocks(arr));

    }

}