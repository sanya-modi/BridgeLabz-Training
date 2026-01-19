package payxpress;

import java.time.LocalDate;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    public ElectricityBill(double amount) {
        super("Electricity", amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Electricity bill reminder: High usage detected. Pay before due date.");
    }
}

