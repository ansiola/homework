package homework5Task2;

public class Main {
    public static void main(String[] args) {
        // Создаем банкомат с 10 купюрами каждого номинала
        ATM atm = new ATM(10, 10, 10);

        // Показываем исходное состояние
        atm.displayInfo();

        // Попробуем снять разные суммы
        atm.withdraw(370);  // 3*100 + 1*50 + 1*20 = 370
        atm.displayInfo();

        atm.withdraw(300);  // 3*100
        atm.displayInfo();

        atm.withdraw(30);   // 1*20 + остаток 10 - невозможно
        atm.displayInfo();

        // Добавляем деньги
        System.out.println("=== Добавляем деньги ===");
        atm.addMoney(2, 0, 1);  // добавляем 5 купюр по 20 и 2 по 100
        atm.displayInfo();

        // Снова пробуем снять
        atm.withdraw(1200);
        atm.displayInfo();
    }
}

