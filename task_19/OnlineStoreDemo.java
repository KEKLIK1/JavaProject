package task_19;

import java.util.Scanner;

public class OnlineStoreDemo {
    public static void placeOrder(Client client) {
        try {
            System.out.println("Начинаем оформление заказа для: " + client);

            INNValidator.validateINN(client);
            System.out.println("Заказ успешно оформлен!");

        } catch (InvalidINNException e) {
            System.err.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        String INN = scanner.nextLine();
        System.out.println("Клиент");
        Client validClient = new Client(first, second, third, INN);
        placeOrder(validClient);
    }
}