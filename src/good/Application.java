package good;

import good.payment.BitcoinPayment;
import good.payment.CreditCardPayment;

public class Application {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(100);
        creditCardPayment.refund(100);

        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        bitcoinPayment.processPayment(100);
    }
}