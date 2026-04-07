package homework9.Task2;

    public class Main {
        public static void main(String[] args) {
            // Создаем объект коллекции
            AnimalCollection animals = new AnimalCollection();

            System.out.println("=== Добавляю животных ===");
            animals.add("Кошочка");
            animals.show();

            animals.add("Собачка");
            animals.show();

            animals.add("Попуг");
            animals.show();

            animals.add("Хомячок");
            animals.show();

            System.out.println("=== Удаляю животных ===");
            animals.remove();
            animals.show();

            animals.remove();
            animals.show();

            animals.remove();
            animals.show();

            animals.remove();
            animals.show();

            System.out.println("=== Проверка удаления из пустой коллекции ===");
            animals.remove();
        }
        }


