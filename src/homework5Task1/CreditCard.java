package homework5Task1;

public class CreditCard {
    String accountNumber;
    double balance;

    // Конструктор
    CreditCard(String number, double money) {
        accountNumber = number;
        balance = money;
    }

    // Метод для пополнения карты
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("На карту " + accountNumber + " начислено " + amount + " руб.");
    }

    // Метод для снятия денег
    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("С карты " + accountNumber + " снято " + amount + " руб.");
    }

    // Метод для вывода информации
    void displayInfo() {
        System.out.println("Карта " + accountNumber + ": баланс = " + balance + " руб.");
    }
}
