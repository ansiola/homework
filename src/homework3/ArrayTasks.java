package homework3;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ввод пользователем размера массива
    System.out.print("Введи размер массива: ");
    int size = scanner.nextInt();

    // Проверка на корректность размера массива
    if (size <= 0) {
        System.out.println("Дружище, размер массива должен быть поболе нуля.");
        return;
    }

    // Создание массива
    int[] array = new int[size];

    // Выбор способа заполнения пользователем
    System.out.println("Выбери способ заполнения массива:");
    System.out.println("1 - Заполнить случайными числами (Math.random())");
    System.out.println("2 - Ввести вручную");
    System.out.print("Итак, твой выбор: ");
    int choice = scanner.nextInt();

    if (choice == 1) {
        // Заполнение случайными числами от 0 до 100
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100); // Исправлено: теперь от 0 до 100
        }
        System.out.println("Массив заполнен случайными числами.");
    } else if (choice == 2) {
        // Заполнение вручную
        System.out.println("Введи элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Значение " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    } else {
        System.out.println("Твой выбор неверен. Попробуй ещё раз.");
        return;
    }

    // Вывод заданного массива
    System.out.println("Исходный массив:");
    printArray(array);

    // Задача 1: Вывод в прямом и обратном порядке
    System.out.println("--- Задача 1 ---");
    System.out.print("В прямом порядке: ");
    printArray(array);
    System.out.print("В обратном порядке: ");
    printArrayReverse(array);

    // Задача 2: Min и Max элементы
    System.out.println("--- Задача 2 ---");
    findMinMax(array);

    // Задача 3: Индексы минимального и максимального значения
    System.out.println("--- Задача 3 ---");
    findMinMaxIndexes(array);

    // Задача 4: Количество нулевых значений
    System.out.println("--- Задача 4 ---");
    countZeros(array);

    // Задача 5: Перестановка элементов (первый с последним и т.д.)
    System.out.println("--- Задача 5 ---");
    reverseSwap(array);

    // Задача 6: Проверка на возрастающую последовательность
    System.out.println("--- Задача 6 ---");
    checkIncreasing(array);

    scanner.close();
}

    // Задача 1: Вывод в прямом и обратном порядке - Метод для вывода массива
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Задача 1: Вывод в прямом и обратном порядке - Метод для вывода массива в обратном порядке
    public static void printArrayReverse(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Задача 2: Min и Max элементы - Метод для поиска минимального и максимального значения
    public static void findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    // Задача 3: Индексы Min и Max значения - Метод для поиска индексов минимального и максимального значения
    public static void findMinMaxIndexes(int[] arr) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Индекс минимального значения (" + arr[minIndex] + "): " + minIndex);
        System.out.println("Индекс максимального значения (" + arr[maxIndex] + "): " + maxIndex);
    }

    // Задача 4: Количество нулевых значений - Метод для подсчета нулевых значений
    public static void countZeros(int[] arr) {

        int zeroCount = 0;

        for (int j : arr) {
            if (j == 0) {
                zeroCount++;
            }
        }

        if (zeroCount > 0) {
            System.out.println("Количество нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }

    // Задача 5: Перестановка элементов - Метод для перестановки элементов (первый с последним, второй с предпоследним и т.д.)
    public static void reverseSwap(int[] arr) {

        System.out.print("Массив после перестановки: ");

        // Создаем копию массива для изменений
        int[] newArray = arr.clone();

        // Меняем местами элементы
        for (int i = 0; i < newArray.length / 2; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[newArray.length - 1 - i];
            newArray[newArray.length - 1 - i] = temp;
        }

        printArray(newArray);
    }

    // Задача 6: Проверка на возрастающую последовательность - Метод для проверки, является ли массив возрастающей последовательностью
    public static void checkIncreasing(int[] arr) {

        if (arr.length == 1) {
            System.out.println("Массив из одного элемента считается возрастающей последовательностью");
            return;
        }

        boolean isIncreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью");
        }
    }
}

