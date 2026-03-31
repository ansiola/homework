package homework6Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Площадь = ширина * высота
    @Override
    double getArea() {
        return width * height;
    }

    // Периметр = 2 * (ширина + высота)
    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

}
