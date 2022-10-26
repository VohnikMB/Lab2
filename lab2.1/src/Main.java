import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List [] list = new List[5];
        list [0]= new List(2);
        list [1]=new List(2);
        list [2]=new List(6);
        list [3]=new List(558);
        list [4]=new List(54);


        for (List i:list) {
            i.print();
        }
        System.out.println();

        List list2 = new List();
        list2.addFirst(1);
        list2.addFirst(2);
        list2.addFirst(11);
        list2.addByIndex(4,2);
        list2.print();


    }
}