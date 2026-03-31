package homework6Task2;

public class Main {
    public static void main(String[] args) {

        // Создаём массив из 5 фигур разных типов
        Figure[] figures = new Figure[5];

        figures[0] = new Triangle(2, 3, 3, 2); // треугольник
        figures[1] = new Rectangle(4, 5);      // прямоугольник
        figures[2] = new Circle(6);            // круг
        figures[3] = new Rectangle(4, 5);      // ещё прямоугольник
        figures[4] = new Triangle(5, 5, 6, 6); // ещё треугольник

        double sumPerimeter = 0; // переменная для суммы периметров
        double sumArea = 0; // переменная для суммы площади

        // Проходим по всем фигурам в массиве для вычисления суммы периметров
        for (int i = 0; i < figures.length; i++) {
            double perimeter = figures[i].getPerimeter(); // получили периметр текущей фигуры
            sumPerimeter = sumPerimeter + perimeter;  // добавили к общей сумме
        }

        // Проходим по всем фигурам в массиве для вычисления суммы площадей
        for (int i = 0; i < figures.length; i++) {
            double area = figures[i].getArea(); // получили площадь текущей фигуры
            sumArea = sumArea + area;  // добавили к общей сумме
        }
        System.out.println("Сумма периметров всех фигур: " + sumPerimeter);
        System.out.println("Сумма площадей всех фигур: " + sumArea);

    }
}
