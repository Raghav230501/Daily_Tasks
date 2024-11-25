import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getName().compareTo(o2.getName()) < 0){
            return -1;
        } else if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        }
        else{
            if(o1.getDeptName().compareTo(o2.getDeptName()) < 0){
                return -1;
            }
            else if(o1.getDeptName().compareTo(o2.getDeptName()) > 0){
                return 1;
            }
            else{
                if(o1.getSalary() < o2.getSalary()) return -1;
                else if(o1.getSalary() > o2.getSalary()) return 1;
                else{
                    if(o1.getDateOfBirth().isBefore(o2.getDateOfBirth())){
                        return -1;
                    } else if (o1.getDateOfBirth().isAfter(o2.getDateOfBirth())) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        }
    }
}

public class Employee {
    private String name;
    private String deptName;
    private int salary;
    private LocalDate dateOfBirth;

    public Employee(String name, String deptName, int salary, LocalDate dateOfBirth) {
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(deptName, employee.deptName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, deptName, salary, dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
