package task_18;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Введите число ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }

        catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Только целые числа и не ноль");
        }
        finally{
            System.out.println("Программа получила: "+ intString);
        }
    }

    static void main() {
        exceptionDemo();
    }
}