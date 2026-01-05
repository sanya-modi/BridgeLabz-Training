package swiftcart;

import java.util.ArrayList;
import java.util.List;

/*
 * Cart manages products and pricing
 */
public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Empty cart constructor
    public Cart() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    // Cart with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update pricing
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.calculatePrice();
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    @Override
    public double applyDiscount(double couponAmount) {

        double productDiscount = 0;

        // Polymorphism: discount depends on product type
        for (Product p : products) {
            productDiscount += p.applyDiscount();
        }

        totalPrice = totalPrice - productDiscount - couponAmount;
        return totalPrice;
    }

    @Override
    public void generateBill() {

        System.out.println("\n----- SwiftCart Bill -----");

        for (Product p : products) {
            System.out.println(p.getName() + " : ₹" + p.calculatePrice());
        }

        System.out.println("Total Price : ₹" + totalPrice);
    }
}
