package good;

import java.math.BigDecimal;

import good.payment.BitcoinPayment;
import good.payment.CreditCardPayment;
import good.payment.Payment;
import good.payment.RefundablePayment;

public class Application {
    public static void main(String[] args) {
        RefundablePayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(BigDecimal.valueOf(100));
        creditCardPayment.refund(BigDecimal.valueOf(100));

        Payment bitcoinPayment = new BitcoinPayment();
        bitcoinPayment.processPayment(BigDecimal.valueOf(0.0025));
    }
}