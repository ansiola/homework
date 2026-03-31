package homework6Task2;

public class Triangle extends Figure{
    private double a, b, c;  // все стороны треугольника
    private double h;        // высота треугольника

    // Конструктор
public  Triangle(double a,double b,double c,double h){
    this.a=a;
    this.b=b;
    this.c=c;
    this.h=h;
}
@Override
    public double getPerimeter() {
    return a+b+c;
}
@Override
    public double getArea() {
    return 0.5 * a * h;
}
}
