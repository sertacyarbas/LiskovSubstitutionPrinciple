package good.payment;

public class BitcoinPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Bitcoin ile " + amount + " BTC ödeme yapıldı.");
    }
}