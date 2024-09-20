package bad.payment;

import java.math.BigDecimal;

public class BitcoinPayment extends Payment {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Bitcoin ile " + amount + " BTC ödeme yapıldı.");
    }

    @Override
    public void refund(BigDecimal amount) {
        // Bitcoin için iade işlemi desteklenmiyor
        throw new UnsupportedOperationException("Bitcoin ödemelerinde iade yapılamaz.");
    }
}