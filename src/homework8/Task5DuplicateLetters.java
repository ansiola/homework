package homework8;
import java.util.Scanner;

public class Task5DuplicateLetters {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            StringBuilder result = new StringBuilder(); // для построения строки

            // процесс дублирования
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                System.out.println("Шаг " + (i + 1) + ": Символ '" + currentChar + "'");
                System.out.println("  Добавляем: " + currentChar + currentChar);

                result.append(currentChar).append(currentChar); // дублируем символ

                System.out.println("  Текущий результат: " + result);
                System.out.println();
            }

            System.out.println("Первоначальная строка: " + input);
            System.out.println("Результат: " + result);
            System.out.println("Длина исходной: " + input.length() + " символов");
            System.out.println("Длина результата: " + result.length() + " символов");

            scanner.close();
        }
    }

