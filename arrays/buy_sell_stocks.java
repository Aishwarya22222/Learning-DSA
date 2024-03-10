package arrays;
import java.util.*;

public class buy_sell_stocks {
    public static int buySellStocks(int stockprice[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<stockprice.length; i++){
            if(buyPrice<stockprice[i]){//profit
                int profit = stockprice[i]- buyPrice; // todays profit
                maxProfit = Math.max(maxProfit,profit);


            } else{
                buyPrice=stockprice[i];
            }
            
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int stockprice[]={7,1,5,3,6,4};
        System.out.println(buySellStocks(stockprice));
        
    }
    
}
