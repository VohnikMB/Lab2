public class Timetable {

    private String weekday;
    private String[] subjectsName;

    public Timetable(String weekday, String[] subjectsName) {
        this.subjectsName = subjectsName;
        this.weekday = weekday;
    }

    public void print() {
        System.out.println(weekday);
        for (String s : subjectsName) {
            System.out.println(s);
        }
        System.out.println("\n");
    }

}
