package SOLID_Principles.Dependency_Inversion_Principle;

public class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via UPI");
    }
}
