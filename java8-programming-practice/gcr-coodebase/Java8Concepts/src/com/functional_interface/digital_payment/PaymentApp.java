package com.functional_interface.digital_payment;

public class PaymentApp {

    public static void main(String[] args) {

        Payment upi = new UpiPayment();
        Payment card = new CreditCardPayment();
        Payment wallet = new WalletPayment();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
    
}
