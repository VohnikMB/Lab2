
public class Main {

    public static void main(String[] args) {
        String[] monday = new String[]{"Higher mathematics", "Philosophy", "Programming"};
        String[] tuesday = new String[]{"Higher mathematics", "History", "Probability theory"};
        Timetable mo = new Timetable("Monday", monday);
        Timetable tu = new Timetable("Tuesday", tuesday);

        Timetable[] w = new Timetable[]{
                mo, tu
        };

        Progress wiktorPhilosophy = new Progress(87, "Philosophy");
        Progress wiktorMathematics = new Progress(87, "Higher mathematics");

        Progress[] ww = new Progress[]{
                wiktorPhilosophy, wiktorMathematics
        };
        Info institute = new Info();
        institute.addStudent("Wiktor", "KI-11", 17, w, ww);
        institute.addStudent("Мах", "KI-11", 18, w, ww);
        institute.printStudent();
        System.out.println();

        Info institute2 = new Info();
        institute2.addStudent("Nina", "KH-21", 19, w, ww);
        System.out.println();
        institute2.printStudentTimetable();

    }
}