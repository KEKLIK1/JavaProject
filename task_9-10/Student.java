package task_10;

public class Student {
    private String name;
    private String second_name;
    private String Special;
    private Integer Curs;
    private Integer FinalMark;


    public Student(String name, String second_name, String special, Integer curs, Integer finalMark) {
        this.name = name;
        this.second_name = second_name;
        this.Special = special;
        this.Curs = curs;
        this.FinalMark = finalMark;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getSpecial() {
        return Special;
    }

    public void setSpecial(String special) {
        this.Special = special;
    }

    public Integer getCurs() {
        return Curs;
    }

    public void setCurs(Integer curs) {this.Curs = curs;}

    public Integer getFinalMark() {return FinalMark;}

    public void setFinalMark(Integer finalMark) {this.FinalMark = finalMark;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", Special='" + Special + '\'' +
                ", Curs=" + Curs +
                ", FinalMark=" + FinalMark +
                '}';
    }
}
