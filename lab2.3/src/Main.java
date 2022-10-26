import service.Service;

public class Main {
    public static void main(String[] args) {
        Service mainService = new Service();
        mainService.base.print();
        mainService.addSubjectsName("KI-11","History",2);
        mainService.base.print();
        mainService.addInfo("KI-11","History","22.05.22");
        System.out.println();
        mainService.sortName("KI-11");
        System.out.println("\nAstronomy:");
        mainService.sortSubjectName("Astronomy");
    }
}