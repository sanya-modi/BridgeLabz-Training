public class CourseFeeDiscount {
    public static void main(String[] args) {

        int fee = 125000;
        int discountPercent = 10;
        //Calculate the discount
        int discount = (fee * discountPercent) / 100;
        //Calculate final fee to pay after discount
        int finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}