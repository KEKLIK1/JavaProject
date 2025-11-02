package task_8;

import java.util.Scanner;

public class tsk_13 {
    public static void recursion() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println(n);
            int m = scanner.nextInt();
            if (m > 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
