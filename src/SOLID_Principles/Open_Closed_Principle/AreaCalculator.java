package SOLID_Principles.Open_Closed_Principle;

import java.util.List;

// AreaCalculator class to calculate areas of multiple shapes
public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
