package homework9;
import java.util.*;

public class Task3WordMultiple {
    // Создаю HashMap для хранения букв и их повторов: ключ (String) - значение (Boolean)
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        // Прохожу по каждому элементу массива строк
        for (String str : strings) {
            if (map.containsKey(str)) {
                // Если уже такой есть, значит это дубль - ставлю true
                map.put(str, true);
            } else {
                // Если встречается  впервые - ставлю false
                map.put(str, false);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        // Проверяю на примере массива строк, где есть повторяющиеся элементы
        String[] arr = {"a", "b", "a", "c", "b", "d"};
        System.out.println(wordMultiple(arr));
    }
}
