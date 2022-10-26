
public class Student {

    //public Timetable thisTimetable = new Timetable (weekday,subjectsName);
    /*public ArrayList<Timetable> thisTimetable = new ArrayList<>();
    public ArrayList<Progress> progresses = new ArrayList<>();*/
    public Timetable[] thisTimetable;
    public Progress[] progresses;
    public int year;
    public String name;
    public String group;

    public Student next;
    public Student prev;

    public Student(String name, String group, int year, Timetable[] thisTimetable, Progress[] progresses) {
        this.name = name;
        this.thisTimetable = thisTimetable;
        this.progresses = progresses;
        this.year = year;
        this.group = group;
    }

    public void print() {
        for (Timetable i : thisTimetable) {
            i.print();
        }
    }


}
