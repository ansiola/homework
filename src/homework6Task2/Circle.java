package homework6Task2;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
