package good.payment;

abstract class Payment {
    // Ortak kodlar bu sınıfta olmalı.
    
    public abstract void processPayment(double amount);
}