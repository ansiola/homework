package homework2;

import java.util.Scanner;

    public class H2_TemperatureChecker {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Запрашиваем у пользователя температуру
            System.out.print("Введите температуру на улице: ");
            int t = scanner.nextInt();

            // Проверяем условия и выводим соответствующий результат
            if (t > -5) {  // если температура больше -5
                System.out.println("Warm");
            }
            else if (t > -20) {  // если температура НЕ больше -5, но больше -20
                System.out.println("Normal");
            }
            else {  // если температура меньше или равна -20
                System.out.println("Cold");
            }
        }
    }