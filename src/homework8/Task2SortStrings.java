package homework8;
import java.util.Arrays;      //  Arrays для использования метода sort()
import java.util.Comparator;  //  Comparator для создания правила сравнения
import java.util.Scanner;

public class Task2SortStrings {

     public static void main(String[] args) {
            // Создаём объект Scanner для чтения данных, которые пользователь введёт с клавиатуры
            Scanner scanner = new Scanner(System.in);

            // Создаём массив для хранения трёх строк, чтобы удобно хранить и обрабатывать несколько строк через циклы
            // Вместо трёх отдельных переменных (str1, str2, str3) используем один массив
            String[] strings = new String[3];

            // ===== ВВОД СТРОК ЧЕРЕЗ ЦИКЛ =====
            // вводим строки через цикл, чтобы не писать три раза одинаковый код для ввода строк
            for (int i = 0; i < strings.length; i++) {
                System.out.println("Введите строку " + (i + 1) + ":");
                // Читаем строку, введённую пользователем, и сохраняем её в i-ю ячейку массива
                strings[i] = scanner.nextLine();
            }

            // сортировка массива по длине строк -нужно упорядочить строки от самой короткой до самой длинной
            // Arrays.sort() - встроенный метод для сортировки массивов
            // strings - наш массив, который нужно отсортировать
            // Comparator.comparingInt() - создаём правило сравнения по целочисленному значению
            // String::length - для каждой строки берём её длину (метод length())
            // В итоге: строки сортируются по возрастанию их длины
            Arrays.sort(strings, Comparator.comparingInt(String::length));

            System.out.println("Строки в порядке возрастания длины:");
            for (int i = 0; i < strings.length; i++) {
                // Выводим:
                // (i + 1) - порядковый номер (1, 2, 3)
                // strings[i] - саму строку в кавычках
                // strings[i].length() - длину строки
                System.out.println((i + 1) + ". \"" + strings[i] +
                        "\" (длина: " + strings[i].length() + " симв.)");
            }
            scanner.close();
        }
    }
