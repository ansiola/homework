package homework8;

import java.util.Scanner;

public class Task3ShorterThanAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String str3 = scanner.nextLine();

        // Вычисляетса длины строк
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        // Вычисляем среднее арифметическое
        // Делим на 3.0 , чтобы получить дробное число типа double
        // Если разделим на целое число 3 , то результат будет целым и отбросится дробная часть
        double average = (len1 + len2 + len3) / 3.0;

        // Выводим среднюю длину (для информации)
        System.out.println("Средняя длина строк: " + average);
        System.out.println("Строки, длина которых меньше средней:");

        // Проверяем каждую строку и выводим те, чья длина меньше средней
        if (len1 < average) {
            System.out.println(str1 + " (длина: " + len1 + " символов)");
        }
        if (len2 < average) {
            System.out.println(str2 + " (длина: " + len2 + " символов)");
        }
        if (len3 < average) {
            System.out.println(str3 + " (длина: " + len3 + " символов)");
        }

        // проверим , вдруг ни одна строка не короче средней
        if (len1 >= average && len2 >= average && len3 >= average) {
            System.out.println("Нет строк, длина которых меньше средней");
        }
        scanner.close();
    }
}