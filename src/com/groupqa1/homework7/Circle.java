package com.groupqa1.homework7;

public class Circle extends Shape {
    private double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return ("class = Circle : color = " + super.getColor());
    }

    @Override
    public double calcArea() {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }

}
