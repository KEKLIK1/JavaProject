package task_18;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }

        catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: ");
        }
    }
    static void main() {
        exceptionDemo();
    }
}