import com.groupqa1.lesson9.Shape;

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
