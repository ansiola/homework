package homework6Task2;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * radius;
    }
}
