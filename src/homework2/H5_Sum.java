package homework2;

import java.util.Scanner;

    public class H5_Sum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите целое положительное число: ");

            // Проверяем, ввел ли пользователь целое число
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();

                // Проверяем, является ли число положительным
                if (n > 0) {
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i;  // sum = sum + i
                    }
                    System.out.println("Сумма чисел от 1 до " + n + " = " + sum);

                } else {
                    System.out.println("Ошибка: число должно быть положительным!");
                }
            } else {
                System.out.println("Ошибка: введено не целое число!");
            }
        }
    }

