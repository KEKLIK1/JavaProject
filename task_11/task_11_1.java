package task_11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task_11_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner nam = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String name = nam.nextLine();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        Date now = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss d MMMM");
        System.out.println("Фамилия: " + name);
        System.out.println("Время получения задания: " + dateFormatter.format(cal.getTime()));
        System.out.println("Время сдачи задания: " + dateFormatter.format(now));
    }
}
