import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);

        s.setName(scanner);
        s.setMarks(scanner);
        s.printData();
        System.out.println("Average mark is " + s.getAverageMark());
        System.out.println("The max mark is " + s.getMaxMark());
        System.out.println(s);
    }

}
