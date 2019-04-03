package com.groupqa1.homework7;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangular(5,5, "red"), new Rectangular(3,3, "orange"),
                        new Rectangular(4,6, "yellow"), new Rectangular(1,1, "green"),
                        new Triangle(3,4,5, "blue"), new Triangle(7,7,7, "violet"),
                        new Circle(10, "pink"), new Circle(5, "grey"), new Circle(9, "black")};

        viewShapes(shapes);
        System.out.println("Sum of all areas is " + calcAreas(shapes));
    }

    static void viewShapes(Shape[] arr) {
        for (Shape element : arr) {
            System.out.println(element.toString() + " area is " + element.calcArea());
        }
    }

    static double calcAreas(Shape[] arr) {
        double allAreas = 0;
        for (Shape element: arr) {
            allAreas += element.calcArea();
        }
        return allAreas;
    }
}
