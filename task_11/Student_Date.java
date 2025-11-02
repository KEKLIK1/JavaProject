package task_11;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Student_Date {
    private Integer day;
    private Integer month;
    private Integer year;
    private String formats;

    public Student_Date(Integer day, Integer month, Integer year, String formats) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.formats = formats;
    }


    @Override
    public String toString() {
        return getFormattedBirthDate(formats);
    }

    public String  getFormattedBirthDate(String gel) {
        Calendar cal = Calendar.getInstance();
        String dat = "";

        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.YEAR, year);

        DateTimeFormatter formatter;
        SimpleDateFormat dateFormatter1 = new SimpleDateFormat("dd.MM.yy");
        SimpleDateFormat dateFormatter2 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat dateFormatter3 = new SimpleDateFormat("dd MMMM yyyy");



        switch (gel) {
            case "SHORT":
                dat = dateFormatter1.format(cal.getTime());
                break;
            case "MEDIUM":
                dat = dateFormatter2.format(cal.getTime());
                break;
            case "FULL":
                dat = dateFormatter3.format(cal.getTime());
                break;
        }

        return dat;
    }

}
