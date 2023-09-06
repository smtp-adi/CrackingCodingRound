package com.com.datastructures.dp;

/** max profit by selling a stock.
 *  Second stock can be sold only if no transactions on previous day
 */
public class MaxProfitBySellingAStock {

    public static void main(String[] args) {
        int[] x={5, 3, 4, 6, 3 };
        int[] y={8, 4, 3, 5, 10};
        System.out.println("Max Profit "+ maxProfit(x,y,x.length-1));
    }
    private static int maxProfit(int[] x, int[] y, int noOfDays){
        System.out.println("no of days "+noOfDays);

        if(noOfDays < 0)
            return 0;
        int profit=0;
        System.out.println("x[noOfDays]"+x[noOfDays]);
        profit = Integer.max(profit, x[noOfDays]+maxProfit(x,y,noOfDays-1));
        System.out.println("profit after 1 "+profit);
        System.out.println("NOFODAYS "+noOfDays);
        profit = Integer.max(profit, y[noOfDays]+maxProfit(x,y,noOfDays-2));
        System.out.println("profit after 2 "+profit);
        return profit;
    }

}
