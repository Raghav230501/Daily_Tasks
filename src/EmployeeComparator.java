import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> {
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