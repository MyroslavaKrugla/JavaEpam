package com.groupqa1.homework7;

public class Shape {
    private String color;

    Shape (String color) {
        this.color = color;
    }

    Shape (){
    }

    @Override
    public String toString() {
        return "class =... : color = ...";
    }

    double calcArea() {
        return 0.0;
    }

    public String getColor() {
        return color;
    }
}
