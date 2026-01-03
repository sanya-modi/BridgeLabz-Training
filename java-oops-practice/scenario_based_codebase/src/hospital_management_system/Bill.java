package hospital_management_system;

public class Bill implements Payable {

    private int billId;
    private double baseAmount;
    private double taxPercentage;
    private double discount;
    private Patient patient;

    public Bill(int billId, double baseAmount, double taxPercentage,
                double discount, Patient patient) {
        this.billId = billId;
        this.baseAmount = baseAmount;
        this.taxPercentage = taxPercentage;
        this.discount = discount;
        this.patient = patient;
    }

    @Override
    public double calculatePayment() {
        double total = baseAmount;

        // polymorphic behavior based on patient type
        if (patient instanceof InPatient) {
            InPatient ip = (InPatient) patient;
            total += ip.calculateRoomCharges();
        } else if (patient instanceof OutPatient) {
            OutPatient op = (OutPatient) patient;
            total += op.getConsultationFee();
        }

        double taxAmount = (total * taxPercentage) / 100;
        total = total + taxAmount - discount;

        return total;
    }
}
