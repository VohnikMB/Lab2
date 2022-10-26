public class Main {
    public static void main(String[] args) {

        Student bogdan = new Student("Bogdan");
        System.out.println("Метод додання та перегляд оцінок одного студента:");
        bogdan.addMark("Math", 98);
        bogdan.addMark("Philosophy", 87);
        bogdan.addMark("Physics", 60);
        bogdan.addMark("History", 87);
        bogdan.print();

        System.out.println("\nМетод зміни:");
        bogdan.overwriting("Philosophy", 100);
        bogdan.print();

        System.out.println("\nМетод видалення:");
        bogdan.dellByIndex("Physics");
        bogdan.print();

        Student igor = new Student("Igor");
        igor.addMark("Math", 90);
        igor.addMark("Philosophy", 67);

        Student ira = new Student("Ira");
        ira.addMark("History", 99);

        Student[] group = new Student[3];
        group[0] = bogdan;
        group[1] = igor;
        group[2] = ira;
        System.out.println("\nМетод перегляду усіх оцінок студентів:");
        for (Student i : group) {
            i.print();
        }
        System.out.println("\nМетод перегляду усіх оцінок за певний предмет:");
        for (Student i : group) {
            i.printDiscipline("Math");
        }

    }


}