package homework2;
import java.util.Scanner;

public class H1_NumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // создаем объект Scanner

        System.out.print("Введите число: ");  // выводим приглашение для ввода данных пользователя (без перевода строки)

        int number = scanner.nextInt();  // читаем целое число, введенное пользователем
// проверяем, является ли число четным операцией взятия остатка от деления на 2 и сравниваем остаток с нулем
        if (number % 2 == 0) {

            System.out.println("Число " + number + " - четное");

        } else {  // иначе (если число нечетное)

            System.out.println("Число " + number + " - нечетное");
        }
    }
}