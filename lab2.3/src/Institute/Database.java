
package Institute;

import java.util.ArrayList;

import static Institute.Timetable.subjectsName;

public class Database {

    public String philosophy = "Philosophy";
    public String mathematics = "mathematics";
    public String biology = "Biology";
    public String botany = "Botany";
    public String probabilityTheory = "Probability theory";
    public String physics = "Physics";
    public String astronomy = "Astronomy";
    public String history = "History";
    public String monday = "Monday";
    public String tuesday = "Tuesday";
    public String wednesday = "Wednesday";
    public String thursday = "Thursday";
    public String friday = "Friday";


    public ArrayList<String> subjectsNameGroup_1Monday = new ArrayList<>();
    public ArrayList<String> subjectsNameGroup_1Wednesday = new ArrayList<>();
    public ArrayList<Student> group_1 = new ArrayList<>();
    public ArrayList<String> group_1Name = new ArrayList<>();
    public ArrayList<Mark> ivanMarks = new ArrayList<>();
    public ArrayList<Mark> bogdanMarks = new ArrayList<>();
    public ArrayList<Mark> marvinMarks = new ArrayList<>();
    public ArrayList<Mark> abigayleMarks = new ArrayList<>();
    public ArrayList<Mark> kenyaMarks = new ArrayList<>();
    public ArrayList<Mark> jasperMarks = new ArrayList<>();

    public ArrayList<String> ivanSubjectName = new ArrayList<>();
    public ArrayList<String> bogdanSubjectName= new ArrayList<>();
    public ArrayList<String> marvinSubjectName = new ArrayList<>();
    public ArrayList<String> abigayleSubjectName = new ArrayList<>();
    public ArrayList<String> kenyaSubjectName = new ArrayList<>();
    public ArrayList<String> jasperSubjectName = new ArrayList<>();

    public Database() {


        Mark ivanMarksPhilosophy = new Mark(philosophy, 89);
        Mark ivanMarksBiology = new Mark(biology, 67);
        Mark ivanMarksAstronomy = new Mark(astronomy, 100);
        Mark ivanMarksProbabilityTheory = new Mark(probabilityTheory, 65);
        ivanMarks.add(ivanMarksPhilosophy);
        ivanMarks.add(ivanMarksBiology);
        ivanMarks.add(ivanMarksAstronomy);
        ivanMarks.add(ivanMarksProbabilityTheory);
        ivanSubjectName.add(physics);
        ivanSubjectName.add(biology);
        ivanSubjectName.add(astronomy);
        ivanSubjectName.add(probabilityTheory);
        Student ivan = new Student(17, "Ivan", ivanMarks);


        bogdanMarks.add(new Mark(philosophy, 89));
        bogdanMarks.add(new Mark(physics, 88));
        bogdanMarks.add(new Mark(biology, 67));
        bogdanMarks.add(new Mark(history, 94));
        bogdanMarks.add(new Mark(probabilityTheory, 65));
        Student bogdan = new Student(19, "Bogdan", bogdanMarks);
        group_1Name.add("Bogdan");


        marvinMarks.add(new Mark(philosophy, 68));
        marvinMarks.add(new Mark(mathematics, 88));
        marvinMarks.add(new Mark(biology, 67));
        marvinMarks.add(new Mark(history, 89));
        marvinMarks.add(new Mark(probabilityTheory, 65));
        Student marvin = new Student(18, "Marvin", marvinMarks);
        group_1Name.add("Marvin");


        abigayleMarks.add(new Mark(philosophy, 89));
        abigayleMarks.add(new Mark(physics, 88));
        abigayleMarks.add(new Mark(biology, 99));
        abigayleMarks.add(new Mark(history, 94));
        abigayleMarks.add(new Mark(probabilityTheory, 100));
        Student abigayle = new Student(20, "Abigayle", abigayleMarks);
        abigayleSubjectName.add(philosophy);
        abigayleSubjectName.add(biology);
        abigayleSubjectName.add(physics);
        abigayleSubjectName.add(history);
        abigayleSubjectName.add(probabilityTheory);


        kenyaMarks.add(new Mark(mathematics, 89));
        kenyaMarks.add(new Mark(physics, 88));
        kenyaMarks.add(new Mark(astronomy, 67));
        kenyaMarks.add(new Mark(history, 94));
        kenyaMarks.add(new Mark(probabilityTheory, 65));
        Student kenya = new Student(22, "Kenya", kenyaMarks);
        kenyaSubjectName.add(mathematics);
        kenyaSubjectName.add(physics);
        kenyaSubjectName.add(astronomy);
        kenyaSubjectName.add(history);
        kenyaSubjectName.add(probabilityTheory);


        jasperMarks.add(new Mark(philosophy, 69));
        jasperMarks.add(new Mark(botany, 88));
        jasperMarks.add(new Mark(biology, 67));
        jasperMarks.add(new Mark(botany, 75));
        jasperMarks.add(new Mark(mathematics, 65));
        Student jasper = new Student(19, "Jasper", jasperMarks);
        group_1Name.add("Jasper");

        subjectsNameGroup_1Monday.add(philosophy);
        subjectsNameGroup_1Monday.add(history);
        subjectsNameGroup_1Monday.add(probabilityTheory);
        subjectsNameGroup_1Monday.add(physics);


        subjectsNameGroup_1Wednesday.add(botany);
        subjectsNameGroup_1Wednesday.add(botany);
        subjectsNameGroup_1Wednesday.add(biology);
        subjectsNameGroup_1Wednesday.add(astronomy);

        ArrayList<Timetable> timetablesGroup_1 = new ArrayList<>();
        timetablesGroup_1.add(new Timetable(monday, subjectsNameGroup_1Monday));
        timetablesGroup_1.add(new Timetable(wednesday, subjectsNameGroup_1Wednesday));


        group_1.add(jasper);
        group_1.add(marvin);
        group_1.add(bogdan);

        Group ki_11 = new Group(group_1, "KI-11", timetablesGroup_1);
        ki_11.print();

    }



    public void print() {
        System.out.println(subjectsName.toString());
    }
}
