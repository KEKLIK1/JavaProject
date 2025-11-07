package task_17;

public class MVCPatternDemo {
    static void main() {
        Student model = retriveStudentFromDa();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Fedor");
        System.out.println("\nAfter updating, Student Details are as follows");
        controller.updateView();
    }
    public static Student retriveStudentFromDa(){
        Student student = new Student();
        student.setName("Grisha");
        student.setRollNo("Da");
        return student;
    }
}
