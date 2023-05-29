package org.example.solid.l;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        AreaCalculator calculator = new AreaCalculator();
        calculator.printArea(rectangle);

        Square square = new Square();
        calculator.printArea(square);
    }
}
