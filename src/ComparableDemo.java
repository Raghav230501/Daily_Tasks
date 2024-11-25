import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

class Student implements Comparable<Student>{

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks < o.marks) return -1;
        if(this.marks > o.marks) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }
}

public class ComparableDemo  {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Raghav", 50));
        students.add(new Student("Kunal", 40));
        students.add(new Student("Yash", 79));
        students.add(new Student("Ajay", 37));

        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString() +  " ");
        }
    }


}
