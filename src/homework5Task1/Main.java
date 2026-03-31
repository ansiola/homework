package homework5Task1;

public class Main {
    public static void main(String[] args) {
        // Создаем три карты
        CreditCard card1 = new CreditCard("1234-5678-9012-3456", 5000);
        CreditCard card2 = new CreditCard("2345-6789-0123-4567", 3000);
        CreditCard card3 = new CreditCard("3456-7890-1234-5678", 10000);

        System.out.println("=== Исходное состояние баланса ===");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

        System.out.println("=== Выполняем операции ===");
        card1.deposit(1500);  // кладем на первую карту
        card2.deposit(2000);  // кладем на вторую карту
        card3.withdraw(3500); // снимаем с третьей карты

        System.out.println("=== Итоговое состояние баланса ===");
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}