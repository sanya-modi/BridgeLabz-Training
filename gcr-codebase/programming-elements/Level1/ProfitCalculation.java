public class ProfitCalculation{
public static void main(String[] args){

int costPrice = 129;
int sellingPrice = 191;

float profit = sellingPrice - costPrice;
float profitPercent = ((profit / costPrice) * 100f);

System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);

System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);

}
}