package swiftcart;

/*
 * Checkout operations
 */
public interface ICheckout {

    void generateBill();

    double applyDiscount(double couponAmount);
}

