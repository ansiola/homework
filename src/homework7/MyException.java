package homework7;
import java.util.Scanner;


public class MyException  {

    // 1. Обычный try-catch
    public void method1() {
        try {
            int i = 10 / 0;      // деление на 0
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль недопустимо!");
        }
    }

    // 2. Несколько catch
    public void method2() {
        try {
            int[] arr = new int[3];
            arr[5] = 10;     // выход за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне массива!");
        } catch (Exception e) {
            System.out.println("Просто ошибка!");
        }
    }

    // 3. Multi-catch (несколько исключений в одном catch)
    public void method3() {
        try {
            String str = null;
            System.out.println(str.length());     // NullPointerException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Ошибка: NullPointerException или арифметика!");
        }
    }

    // 4. try-catch-finally
    public void method4() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int num = Integer.parseInt(scanner.nextLine()); // ввод букв и преобразование
            System.out.println("Вы ввели число: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: вы ввели не число!");
        } finally {
            System.out.println("Завершаем работу блока try-catch");
        }
    }

    // Главный метод для демо различных try-catch
    public static void main(String[] args) {
        MyException  demo = new MyException ();

        demo.method1();
        demo.method2();
        demo.method3();
        demo.method4();
    }
}

