package Institute;

public class Mark {
    String subjectName;
    int subjectMark;

    public Mark(String subjectName, int subjectMark) {
        this.subjectMark = subjectMark;
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return subjectName + ": " + subjectMark;
    }
}