package SOLID_Principles.Dependency_Inversion_Principle;

// High-level module now depends on PaymentMethod abstraction
public class PaymentService {
    private PaymentMethod paymentMethod;

    // Constructor injection for dependency inversion
    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);  // Payment processing using abstraction
    }
}
