// File: StudentList.java
import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        String name;

        System.out.println("Enter student names (type 'exit' to finish):");
        while (true) {
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            students.add(name);
        }

        System.out.println("Student names:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
