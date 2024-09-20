package good.payment;

import java.math.BigDecimal;

public class BitcoinPayment extends Payment {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Bitcoin ile " + amount + " BTC ödeme yapıldı.");
    }
}