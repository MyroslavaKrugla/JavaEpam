package com.groupqa1.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] { new Circle(3.0, "qer"), new Circle(5.0, "hgd"), new Circle(9.0, "hgfd"), new Circle(5.5, "jhgf")};
        printShapes(shapes);
        System.out.println("==============");
        Arrays.sort(shapes, new CompareShapeByArea());
        printShapes(shapes);
    }

    public static void printShapes (Shape[] shapes) {
        for (Shape elem : shapes) {
            elem.draw();
        }
    }


}
