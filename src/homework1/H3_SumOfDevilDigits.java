package homework1;

public class H3_SumOfDevilDigits {
    public static void main(String[] args) {
        int n = 666; // трёхзначное число Сотоны

        int firstDigit = n / 100;          // 6
        int secondDigit = (n / 10) % 10;   // 6
        int thirdDigit = n % 10;            // 6
        int sum = firstDigit + secondDigit + thirdDigit;  // 6 + 6 + 6 = 18

        System.out.println("Сумма цифр сатанинского числа \uD83D\uDE08 " + n + " = " + sum);
    }
}
