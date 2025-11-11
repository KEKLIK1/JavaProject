package task_18;

public class Exception5 {
    static void main() {
        try {
            ThrowsDemo throwsDemo = new ThrowsDemo();
            throwsDemo.printMessage(null);
        }
        catch (NullPointerException e){
            System.out.println("Null detected");

        }
    }
}
