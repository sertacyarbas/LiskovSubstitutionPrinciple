package good.payment;

import java.math.BigDecimal;

public abstract class Payment {
    // Ortak kodlar bu sınıfta olmalı.
    
    public abstract void processPayment(BigDecimal amount);
}