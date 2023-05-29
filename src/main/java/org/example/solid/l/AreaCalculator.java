package org.example.solid.l;

public class AreaCalculator {
    public void printArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        int area = rectangle.calculateArea();
        System.out.println("Area: " + area);
    }
}
