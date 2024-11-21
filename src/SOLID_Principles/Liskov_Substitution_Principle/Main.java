package SOLID_Principles.Liskov_Substitution_Principle;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        ((Flyable) sparrow).fly();
        sparrow.eat();

        // ((Flyable) penguin).fly(); // This will throw a ClassCastException
        penguin.eat();
    }
}
