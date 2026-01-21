package sorting.tailorshop;

class Order {

    int orderId;
    String customerName;
    int deliveryDeadline; // in days

    public Order(int orderId, String customerName, int deliveryDeadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryDeadline = deliveryDeadline;
    }

    public void display() {
        System.out.println(
                "Order ID: " + orderId +
                ", Customer: " + customerName +
                ", Deadline (days): " + deliveryDeadline
        );
    }
}

