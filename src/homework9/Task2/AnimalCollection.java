package homework9.Task2;

import java.util.*;

public class AnimalCollection {
    // Коллекция для хранения наших животных
    private LinkedList<String> animals = new LinkedList<>();

    // Добавление нашего животного в начало коллекции
    public void add(String animal) {
        animals.addFirst(animal);
        System.out.println("Добавлено: " + animal);
    }

    // Удаление животного с конца коллекции
    public void remove() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция нашего зоопарка пуста, больше некого удалять!");
            return;
        }
        String removed = animals.removeLast();
        System.out.println("Удалено: " + removed);
    }

    // Показать всех наших животных
    public void show() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция животных пуста");
            return;
        }
        System.out.println("Животные в коллекции: " + animals);
    }
}

