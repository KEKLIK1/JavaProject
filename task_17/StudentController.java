package task_17;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }
    public String getStundentName(){
        return model.getRollNo();
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public void updateView(){
        view.printStudentDetails(model.getRollNo(), model.getName());
    }
}
