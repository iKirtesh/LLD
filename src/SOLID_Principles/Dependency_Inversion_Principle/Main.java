package SOLID_Principles.Dependency_Inversion_Principle;

public class Main {
    public static void main(String[] args) {
        // Low-level modules (payment methods) are injected into the high-level module (payment service)

        // Using CreditCardPayment
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentService creditCardPaymentService = new PaymentService(creditCardPayment);
        creditCardPaymentService.processPayment(100.0);

        // Using UPIPayment
        PaymentMethod upiPayment = new UPIPayment();
        PaymentService upiPaymentService = new PaymentService(upiPayment);
        upiPaymentService.processPayment(200.0);

        // Using BitCoin
        PaymentMethod bitCoinPayment = new BitCoin();
        PaymentService bitCoinPaymentService = new PaymentService(bitCoinPayment);
        bitCoinPaymentService.processPayment(300.0);
    }
}
