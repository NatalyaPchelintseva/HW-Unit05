import java.util.Arrays;
import java.util.Scanner;

public class Student {

    private String name;
    private int[] marks = new int[5];

    public void setName(Scanner s) {
        System.out.print("Enter student name: ");
        if (s.hasNextLine()) {
            name = s.nextLine();
        }
    }

    public void setMarks(Scanner s) {
        System.out.println("Enter student's marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            marks[i] = s.nextInt();
            s.hasNextLine();
        }
    }

    public void printData() {
        String data = "name: " + name + "\nmarks: ";
        for (int i = 0; i < 5; i++) {
            data += marks[i] + " ";
        }
        System.out.println(data);
    }

    public float getAverageMark() {
        float sum = 0f;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        return sum / 5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public int getMaxMark() {
        int max = this.marks[0];
        for (int i = 1; i < this.marks.length; i++) {
            if (max < this.marks[i]) {
                max = marks[i];
            }
        }
        return max;
    }
}
