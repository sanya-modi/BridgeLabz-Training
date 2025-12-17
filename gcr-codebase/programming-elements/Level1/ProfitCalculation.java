public class ProfitCalculation{
    public static void main(String[] args){

        int costPrice = 129;
        int sellingPrice = 191;
        //Calculating profit
        float profit = sellingPrice - costPrice;
        //Calculating profit percentage
        float profitPercent = ((profit / costPrice) * 100f);

        //Print Cost price and Selling Price
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        //Print profit and profit percentage
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);

}
}