package SOLID_Principles.Dependency_Inversion_Principle;

// Low-level module now implements the PaymentMethod interface
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made by credit card.");
    }
}
