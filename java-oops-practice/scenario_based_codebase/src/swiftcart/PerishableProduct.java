package swiftcart;

/*
 * Perishable products like fruits, vegetables, dairy
 */
public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    // Higher discount for perishables
    @Override
    public double applyDiscount() {
        return calculatePrice() * 0.10; // 10% discount
    }
}
