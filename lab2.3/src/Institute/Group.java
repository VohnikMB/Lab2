package Institute;

import java.util.ArrayList;

public class Group {
    public ArrayList<Student> students;
    public static String groupName;
    public static ArrayList<Timetable> timetables;

    public Group(ArrayList<Student> students,String groupName,ArrayList<Timetable> timetables){
        Group.timetables =timetables;
        Group.groupName =groupName;
        this.students=students;
    }
    @Override
    public String toString() {
        return groupName + ": " + timetables;
    }

    public void print() {
        System.out.println(groupName.toString());
    }
}
