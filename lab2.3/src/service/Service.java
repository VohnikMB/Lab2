package service;

import Institute.Database;
import Institute.Timetable;

import java.util.ArrayList;
import java.util.Collections;

public class Service {
    public Database base = new Database();

    public Service() {

    }

    public void sortName(String group) {
        if (group.equals("KI-11")) {
            ArrayList<String> students = base.group_1Name;
            Collections.sort(students);
            for (String i : students) {
                System.out.println(i);
            }
        }
    }

    public void sortSubjectName(String SubjectName) {
        if (base.kenyaSubjectName.contains(SubjectName)) {
            System.out.println("Kenya");

        }
        if (base.abigayleSubjectName.contains(SubjectName)) {
            System.out.println("Abigayle");

        }
        if (base.ivanSubjectName.contains(SubjectName)) {
            System.out.println("Ivan");

        }
    }

    public void addInfo(String group, String subjectsName, String info) {
        Timetable infoAdd = new Timetable(group, subjectsName, info);
    }

    public void addSubjectsName(String group, String SubjectsName, int weekday) {
        if (group.equals("KI-11")) {
            switch (weekday) {
                case 1:
                    base.subjectsNameGroup_1Monday.add(SubjectsName);
                    break;
                case 2:
                    base.subjectsNameGroup_1Wednesday.add(SubjectsName);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

}
