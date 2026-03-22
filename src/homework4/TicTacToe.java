package homework4;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== ИГРА КРЕСТИКИ-НОЛИКИ ===");

        // Инициализация игрового поля
        initBoard();

        // Основной игровой цикл
        boolean gameRunning = true;

        while (gameRunning) {
            // Вывод игрового поля
            printBoard();

            // Ход игрока
            System.out.println("Игрок " + currentPlayer + ", твой ход!");
            makeMove();

            // Проверка на победу
            if (checkWin()) {
                printBoard();
                System.out.println("Моё почтение! Игрок " + currentPlayer + " ПОБЕДИЛ!");
                gameRunning = false;
            }
            // Проверка на ничью
            else if (isDraw()) {
                printBoard();
                System.out.println("Ничья, победила дружба!");
                gameRunning = false;
            }
            // Смена игрока
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        System.out.println("Спасибо за игру! Пойдем отметим!");
        scanner.close();
    }

    // Инициализация игрового поля
    public static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Вывод игрового поля
    public static void printBoard() {
        System.out.println("   1   2   3");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < SIZE - 1) {
                System.out.println("  -----------");
            }
        }
    }

    // Выполнение хода
    public static void makeMove() {
        int row, col;
        boolean validMove = false;

        while (!validMove) {
            System.out.print("Введи номер строки (1-3): ");
            row = scanner.nextInt() - 1;
            System.out.print("Введи номер столбца (1-3): ");
            col = scanner.nextInt() - 1;

            // Проверка корректности ввода
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("Ошибка! Координаты должны быть от 1 до 3. Попробуй снова.");
            }
            else if (board[row][col] != ' ') {
                System.out.println("Ошибка! Эта клетка уже занята. Выбери другую.");
            }
            else {
                board[row][col] = currentPlayer;
                validMove = true;
            }
        }
    }

    // Проверка победы
    public static boolean checkWin() {
        // Проверка строк
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Проверка столбцов
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == currentPlayer &&
                    board[1][j] == currentPlayer &&
                    board[2][j] == currentPlayer) {
                return true;
            }
        }

        // Проверка главной диагонали
        if (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) {
            return true;
        }

        // Проверка побочной диагонали
        if (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    // Проверка ничьи
    public static boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false; // Есть свободная клетка, show must go on!
                }
            }
        }
        return true; // Ничья, победила дружба
    }
}
