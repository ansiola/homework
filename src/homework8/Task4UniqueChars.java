package homework8;

import java.util.Scanner;

public class Task4UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = sc.nextLine();
        System.out.println("Введите вторую строку:");
        String s2 = sc.nextLine();
        System.out.println("Введите третью строку:");
        String s3 = sc.nextLine();

        String result = null;
        String[] allWords = (s1 + " " + s2 + " " + s3).split(" "); // склеиваем все слова и разбиваем по пробелу в массив

        for (int i = 0; i < allWords.length; i++) {
            String word = allWords[i];
            {
                if (isAllUnique(word)) {
                    result = word;
                    break;
                }
            }
        }

        if (result != null) {
            System.out.println("Слово: " + result + " (длина: " + result.length() + ")");
        } else {
            System.out.println("Слов с уникальными символами не найдено");
        }
    }

    // Проверяем все ли символы разные
    static boolean isAllUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}