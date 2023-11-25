package org.app;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }

            if(prices[i]-minPrice >= maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args){
        System.out.println(BuySellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
