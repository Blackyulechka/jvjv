package L7_4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main7_4 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student student;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о студенте");
            String info = scanner.nextLine();
            if (info.equals("end")) {
                break;
            }
            String[] parts = info.split(" ");

            String name = parts[0];
            String group = parts[1];
            String studentId = parts[2];

            student = new Student(name, group, studentId);

            if (!students.add(student)) {
                System.out.println("Студент с таким ID уже существует");
            }
        }
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
