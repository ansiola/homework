package homework3;
import java.util.Scanner;

public class AsteriskTask {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод размера массива
            System.out.print("Введи размер массива: ");
            int size = scanner.nextInt();

            // Создание и заполнение массива
            int[] array = new int[size];
            System.out.println("Введи элементы массива (цифры от 0 до 9):");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            // Вывод исходного массива
            System.out.print("Исходный массив: ");
            printArray(array);

            // Добавление единицы
            int[] result = addOne(array);

            // Вывод результата
            System.out.print("Результат: ");
            printArray(result);
        }

        //  Метод добавления единицы
        public static int[] addOne(int[] digits) {
            // Идем с конца массива
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    // Если цифра меньше 9, просто увеличиваем ее на 1
                    digits[i]++;
                    return digits;
                } else {
                    // Если цифра 9, заменяем на 0
                    digits[i] = 0;
                }
            }

            // Если все цифры были 9, создаем новый массив
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            return newArray;
        }

        // Метод для вывода массива
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
