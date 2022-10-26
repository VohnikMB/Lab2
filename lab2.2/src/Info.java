import java.util.ArrayList;

public class Info {
    private Student head;
    private Student tail;

    public Info() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addStudent(String name, String group, int year, Timetable[] thisTimetable, Progress[] progresses) {
        Student temp = new Student(name, group, year, thisTimetable, progresses);
        if (isEmpty()) {
            tail = temp;
        } else {
            head.prev = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void printStudent() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.name + " group: " + temp.group);
            temp = temp.next;
        }
    }
    public void printStudentTimetable() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.name + " group: " + temp.group+"\n");
            temp.print();
            temp = temp.next;
        }
    }



}
