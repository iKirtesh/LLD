package SOLID_Principles.Single_Responsibility_Principle;

// Single Responsibility Principle
// This class is responsible for creating a Marker object
// It has only one reason to change, which is to change the way a Marker object is created
// It is not responsible for any other functionality
// If we want to change the way a Marker object is created, we only need to change this class

public class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}
