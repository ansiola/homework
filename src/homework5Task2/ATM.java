package homework5Task2;

public class ATM {
    int count20;  // количество купюр по 20
    int count50;  // количество купюр по 50
    int count100; // количество купюр по 100

    // Конструктор с тремя параметрами
    ATM(int twenties, int fifties, int hundreds) {
        count20 = twenties;
        count50 = fifties;
        count100 = hundreds;
    }

    // Метод для добавления денег в банкомат
    void addMoney(int twenties, int fifties, int hundreds) {
        count20 = count20 + twenties;
        count50 = count50 + fifties;
        count100 = count100 + hundreds;
        System.out.println("Деньги добавлены. Добавлено: " + twenties + " шт. по 20, "
                + fifties + " шт. по 50, " + hundreds + " шт. по 100");
    }

    // Метод для снятия денег
    boolean withdraw(int amount) {
        System.out.println("Запрос на снятие: " + amount + " руб.");

        // Проверяем, есть ли вообще такая сумма в банкомате
        int totalMoney = count20 * 20 + count50 * 50 + count100 * 100;
        if (amount > totalMoney) {
            System.out.println("Ошибка: нужно больше золота!");
            return false;
        }

        int need100 = 0;
        int need50 = 0;
        int need20 = 0;

        int remaining = amount;

        // Сначала попробуем выдать купюрами по 100
        need100 = Math.min(remaining / 100, count100);
        remaining = remaining - need100 * 100;

        // Потом купюрами по 50
        need50 = Math.min(remaining / 50, count50);
        remaining = remaining - need50 * 50;

        // Потом купюрами по 20
        need20 = Math.min(remaining / 20, count20);
        remaining = remaining - need20 * 20;

        // Если остаток не равен 0, значит не можем выдать такую сумму
        if (remaining != 0) {
            System.out.println("Ошибка: невозможно выдать запрошенную сумму клиенту данными купюрами!");
            return false;
        }

        // Если всё получилось, обновляем количество купюр
        count100 = count100 - need100;
        count50 = count50 - need50;
        count20 = count20 - need20;

        // Выводим информацию о выдаче
        System.out.println("Операция прошла успешна! Выдано:");
        if (need100 > 0) {
            System.out.println("  " + need100 + " шт. по 100 руб. = " + (need100 * 100) + " руб.");
        }
        if (need50 > 0) {
            System.out.println("  " + need50 + " шт. по 50 руб. = " + (need50 * 50) + " руб.");
        }
        if (need20 > 0) {
            System.out.println("  " + need20 + " шт. по 20 руб. = " + (need20 * 20) + " руб.");
        }

        return true;
    }

    // Метод для вывода информации о банкомате
    void displayInfo() {
        int total = count20 * 20 + count50 * 50 + count100 * 100;
        System.out.println("=== Состояние банкомата ===");
        System.out.println("Купюр по 100: " + count100 + " шт. (" + (count100 * 100) + " руб.)");
        System.out.println("Купюр по 50: " + count50 + " шт. (" + (count50 * 50) + " руб.)");
        System.out.println("Купюр по 20: " + count20 + " шт. (" + (count20 * 20) + " руб.)");
        System.out.println("Всего денег: " + total + " руб.");
    }
}

