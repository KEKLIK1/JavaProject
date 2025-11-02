package task_11;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class task_11_3 {

    static void main() {
        Scanner nam = new Scanner(System.in);
        System.out.println("Введите день");
        int day = Integer.parseInt(nam.nextLine());
        System.out.println("Введите месяц");
        int month = Integer.parseInt(nam.nextLine());
        System.out.println("Введите год");
        int year = Integer.parseInt(nam.nextLine());
        System.out.println("Введите формат: SHORT, MEDIUM, FULL");
        String format = nam.nextLine();
        Student_Date studentDate = new Student_Date(day, month, year, format);

        System.out.println(studentDate);
    }
}
