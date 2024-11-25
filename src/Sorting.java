import java.time.LocalDate;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        ArrayList<Employee> empData = new ArrayList<>();
        empData.add(new Employee("Raghav Kavi", "HR", 30000, LocalDate.of(2001, 5, 23)));
        empData.add(new Employee("Kunal Sehgal", "HR", 40000, LocalDate.of(2001, 11, 7)));
        empData.add(new Employee("Kunal Kamra", "HR", 35000, LocalDate.of(2001, 11, 7)));
        empData.add(new Employee("Yash Nikam", "IT", 35000, LocalDate.of(2003, 11, 3)));
        empData.add(new Employee("Yash Nikam", "IT", 30000, LocalDate.of(2002, 11, 3)));
        empData.add(new Employee("Akash Syal", "IT", 40000, LocalDate.of(2002, 9, 19)));
        empData.add(new Employee("Shreeraj ghadge", "HR", 26200, LocalDate.of(2001, 7, 9)));


        Collections.sort(empData, new EmployeeComparator());

        // Print the sorted lists
        for (Employee e : empData) {
            System.out.println(e.toString());
        }

    }
}




