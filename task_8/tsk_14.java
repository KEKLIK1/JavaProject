package task_8;

import java.util.Scanner;

public class tsk_14 {
    public static void prnt(int n){
        if (n < 10){
            System.out.println(n);
            return;
        }
        prnt(n / 10);
        System.out.println(n % 10);

    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prnt(n);
    }
}
