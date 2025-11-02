package task_13;

import java.util.Scanner;

public class PhoneParser {
    private String code, city, triplet, quadruple;

    public PhoneParser(String phone) {
        if (phone.length() < 10 || phone.length() > 13) {
            System.out.println("Неверное количество цифр.");
            System.out.println("Проверьте правильность номера.");
            return;
        }

        if (phone.startsWith("8")) {
            code = "+7";
        }
        else  {
            code = "+" + phone.charAt(1);
        }

        city = phone.substring(phone.length() - 10, phone.length() - 7);
        triplet = phone.substring(phone.length() - 7, phone.length() - 4);
        quadruple = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер телефона, который хотите ввести");
        System.out.println(new PhoneParser(scanner.next()));


    }
}
