package homework9;
import java.util.*;

public class Task1DeleteDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через запятую и пробел: ");
        String inputString = scanner.nextLine();

        // разбиваем строку на массив чисел
        String[] numbersArray = inputString.split(",\\s*");

        // используем HashSet для удаления дублей
        Set<String> uniqueNumbersSet = new HashSet<>(Arrays.asList(numbersArray));

        //  результат
        System.out.print("Результат без дублей: ");
        System.out.println(String.join(", ", uniqueNumbersSet));

        scanner.close();
    }
}
