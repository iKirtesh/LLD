package SOLID_Principles.Dependency_Inversion_Principle;

public class BitCoin implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via BitCoin");
    }
}
