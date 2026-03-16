package homework1;


public class H2_SumOfDigits {
    public static void main(String[] args) {
        int n = 58; // двузначное число

        int firstDigit = n / 10;      // целочисленное деление дает первую цифру - 5
        int secondDigit = n % 10;     // остаток от деления дает нам - 8
        int sum = firstDigit + secondDigit;  // 5 + 8 = 13

        System.out.println("Сумма цифр числа " + n + " = " + sum);
    }
}