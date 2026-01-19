package payxpress;

import java.time.LocalDate;

abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    private boolean isPaid; // encapsulated

    // Constructor for one-time bill
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Constructor for recurring bill (monthly)
    public Bill(String type, double amount) {
        this(type, amount, LocalDate.now().plusMonths(1));
    }

    // Operator usage: late fee calculation
    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    @Override
    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println(type + " bill is already paid.");
        }
    }

    // Encapsulation: controlled access
    public boolean isPaid() {
        return isPaid;
    }

    public void showBillDetails() {
        System.out.println(type + " | Amount: ₹" + amount +
                " | Due Date: " + dueDate +
                " | Paid: " + isPaid);
    }
}

