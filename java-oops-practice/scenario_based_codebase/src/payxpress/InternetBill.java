package payxpress;

import java.time.LocalDate;

class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    public InternetBill(double amount) {
        super("Internet", amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Internet bill reminder: Service may be suspended if unpaid.");
    }
}

