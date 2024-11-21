package SOLID_Principles.Liskov_Substitution_Principle;

public interface Flyable {
    default void fly() {
        System.out.println("Flying");
    }
}
