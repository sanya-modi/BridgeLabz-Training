package swiftcart;

/*
 * Base Product class
 */
public abstract class Product {

    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // Calculate price using operator
    public double calculatePrice() {
        return price * quantity;
    }

    // Polymorphic discount method
    public abstract double applyDiscount();

    public String getName() {
        return name;
    }
}
