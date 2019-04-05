package com.groupqa1.lesson9;

public abstract class Shape implements Drawable {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    Shape(){
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": color = ...";
    }

    abstract public double  calcArea();

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this + " -> area = " + this.calcArea());
    }
}
