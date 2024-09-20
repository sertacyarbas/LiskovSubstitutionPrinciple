package good.payment;

public class CreditCardPayment extends Payment implements Refundable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Kredi kartı ile " + amount + " TL ödeme yapıldı.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Kredi kartı ile " + amount + " TL iade yapıldı.");
    }
}