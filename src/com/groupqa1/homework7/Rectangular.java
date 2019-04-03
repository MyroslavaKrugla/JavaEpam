package com.groupqa1.homework7;

public class Rectangular extends Shape {
    private double height;
    private double width;

    Rectangular(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return ("class = Rectangular: color " + super.getColor());
    }

    @Override
    public double calcArea() {
        double area = height * width;
        return area;
    }

}
