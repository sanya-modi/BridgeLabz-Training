//Calculate discount based on total bill

import java.util.*;

public class DiscountCalculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    	//Total Bill
	double totalBill = 0;
	//Number of items purchased
	System.out.println("Enter the number of items purchased");
	int n = sc.nextInt();

	//input item prices
	for(int i=0; i<n; i++){
	System.out.printf("Price of %d item : ", i+1);
        double price = sc.nextDouble();
        totalBill += price;
	}
        
	//Discount according to total bill
	double discountAmount = 0;
	if(totalBill > 5000){
	//30% off if totalBill is greater than 5000
	discountAmount = totalBill * 0.3;
	}
        else if(totalBill > 2000){
	//10% off if totalBill is greater than 2000
	discountAmount = totalBill * 0.1;
	}
        else if(totalBill > 100){
	//5% off purchase atleast greater than 100
	discountAmount = totalBill * 0.05;
	}

        System.out.println("----------Bill----------");
        System.out.println("Total Items : " + n);
        System.out.printf("Total Amount : %.2f%n", totalBill);
	System.out.printf("Discount Applied : %.2f%n", discountAmount);
	System.out.printf("Pay Amount : %.2f%n", (totalBill - discountAmount));
        System.out.println("------------------------");



    }
}