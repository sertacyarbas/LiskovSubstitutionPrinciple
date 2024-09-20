package bad;

import java.math.BigDecimal;

import bad.payment.BitcoinPayment;
import bad.payment.CreditCardPayment;
import bad.payment.Payment;

public class Application {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(BigDecimal.valueOf(100));
        creditCardPayment.refund(BigDecimal.valueOf(100));

        Payment bitcoinPayment = new BitcoinPayment();
        bitcoinPayment.processPayment(BigDecimal.valueOf(0.0025));
        bitcoinPayment.refund(BigDecimal.valueOf(0.0025));
    }
}
