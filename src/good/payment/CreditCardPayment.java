package good.payment;

import java.math.BigDecimal;

public class CreditCardPayment extends Payment implements Refundable {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Kredi kartı ile " + amount + " TL ödeme yapıldı.");
    }

    @Override
    public void refund(BigDecimal amount) {
        System.out.println("Kredi kartı ile " + amount + " TL iade yapıldı.");
    }
}