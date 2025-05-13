package L7_4;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return name + ", " + group + ", " + studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != this.getClass()) {
            return false;
        }
        Student contact = (Student) obj;
        return Objects.equals(studentId, contact.studentId);
    }
}
