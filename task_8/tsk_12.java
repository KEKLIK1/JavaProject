package task_8;
import java.util.Scanner;

public class tsk_12 {
    static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            return; // Базовый случай рекурсии
        }

        if (number % 2 != 0) {
            System.out.println(number);
        }

       printOddNumbers();// Рекурсивный вызов
    }
    static void main(String[] args) {
        printOddNumbers();
    }
}
