package good.payment;

import java.math.BigDecimal;

public interface Refundable {
    void refund(BigDecimal amount);
}