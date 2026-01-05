package swiftcart;

/*
 * Non-perishable products like grains, packaged food
 */
public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    // Lower discount
    @Override
    public double applyDiscount() {
        return calculatePrice() * 0.05; // 5% discount
    }
}

