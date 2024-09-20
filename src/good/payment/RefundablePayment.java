package good.payment;

import java.math.BigDecimal;

public abstract class RefundablePayment extends Payment {
    public abstract void refund(BigDecimal amount);
}