package payxpress;

import java.time.LocalDate;

class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public WaterBill(double amount) {
        super("Water", amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Water bill reminder: Avoid late fees by paying on time.");
    }
}

