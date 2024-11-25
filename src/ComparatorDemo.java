import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getMarks() - o1.getMarks();
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Raghav", 50));
        students.add(new Student("Kunal", 40));
        students.add(new Student("Yash", 79));
        students.add(new Student("Ajay", 37));

        Collections.sort(students, new MyComparator());

        for (Student student : students) {
            System.out.println(student.toString() + " ");
        }
    }
}
