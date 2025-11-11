package task_18;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean valid = false;
        while(!valid) {
            try {
                String key = myScanner.next();
                printDetails(key);
                valid = true;
            }
            catch (Exception e) {
                System.out.println("Try again with non-empty key");
            }
        }
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key)  {
        return "data for " + key; }
}