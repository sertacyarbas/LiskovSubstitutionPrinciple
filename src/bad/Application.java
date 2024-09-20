package bad;

import java.math.BigDecimal;

import bad.payment.BitcoinPayment;
import bad.payment.CreditCardPayment;

public class Application {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(BigDecimal.valueOf(100));
        creditCardPayment.refund(BigDecimal.valueOf(100));

        BitcoinPayment bitcoinPayment = new BitcoinPayment();
        bitcoinPayment.processPayment(BigDecimal.valueOf(100));
        bitcoinPayment.refund(BigDecimal.valueOf(100));
    }
}
