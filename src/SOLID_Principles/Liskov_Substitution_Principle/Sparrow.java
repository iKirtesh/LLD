package SOLID_Principles.Liskov_Substitution_Principle;

// Sparrow class implements Flyable
public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
