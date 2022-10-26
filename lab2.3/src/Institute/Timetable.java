package Institute;

import java.util.ArrayList;

public class Timetable {
    String weekday;
    String subjectsName2;
    String group;
    String info;
    static ArrayList<String> subjectsName;

    public Timetable(String weekday, ArrayList<String> subjectsName) {
        Timetable.subjectsName = subjectsName;
        this.weekday = weekday;
    }
    public Timetable(String group, String subjectsName,String info) {
        subjectsName2 = subjectsName;
        this.group = group;
        this.info=info;
        System.out.println(group+", "+subjectsName2+", "+info);
    }

    @Override
    public String toString() {
        return subjectsName + ": " + weekday;
    }
}