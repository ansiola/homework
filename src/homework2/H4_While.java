package homework2;

public class H4_While {
    public static void main(String[] args) {
        // Наше начальное значение
        int number = 7;

        // Цикл while для вывода последовательности
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;  // увеличиваем число на 7 (number = number + 7)
        }
    }
}
