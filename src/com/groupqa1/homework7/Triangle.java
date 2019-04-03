package com.groupqa1.homework7;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle (double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return ("class = Traingle: color " + super.getColor());
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
