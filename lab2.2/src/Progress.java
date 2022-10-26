public class Progress {
    private String subjects;
    private int mark;

    public Progress(int mark,String subjects){
        this.mark=mark;
        this.subjects=subjects;
    }

    public void print(){
        System.out.println(subjects+": "+ mark);
    }
}
