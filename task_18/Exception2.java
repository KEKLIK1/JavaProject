package task_18;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }

        catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Только целые числа и не ноль");
        }
    }

    static void main() {
        exceptionDemo();
    }
}