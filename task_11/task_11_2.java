package task_11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task_11_2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner nam = new Scanner(System.in);
        System.out.println("Введите часы");
        int hour = Integer.parseInt(nam.nextLine());
        System.out.println("Введите минуты");
        int minute = Integer.parseInt(nam.nextLine());
        System.out.println("Введите секунды");
        int second = Integer.parseInt(nam.nextLine());

        cal.set(Calendar.HOUR, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);

        Date now = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss ");
        System.out.println("Время от пользователя: " + dateFormatter.format(cal.getTime()));
        System.out.println("Время сейчас: " + dateFormatter.format(now));
        if (cal.getTimeInMillis() > now.getTime()){
            System.out.println("Введенное время больше");
        }
        else if (cal.getTimeInMillis() == now.getTime()) {
            System.out.println("Введенные времена равны");
        }
        else {
            System.out.println("Введенное время меньше");
        }
    }
}
