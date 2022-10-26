package Institute;

import java.util.ArrayList;

public class Student {
    public int year;
    public String name;

    public ArrayList<Mark> marks;

    public Student(int year, String name, ArrayList<Mark> marks) {
        this.marks = marks;
        this.year = year;
        this.name = name;
    }

    public void print() {
        System.out.println(marks.toString());
    }
    public void printName() {
        System.out.println(name);
    }
}
