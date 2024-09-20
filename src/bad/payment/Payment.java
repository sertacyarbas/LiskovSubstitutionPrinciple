package bad.payment;

import java.math.BigDecimal;

public abstract class Payment {
    // Ortak kodlar bu sınıfta olmalı.

    public abstract void processPayment(BigDecimal amount);

    public abstract void refund(BigDecimal amount);
}