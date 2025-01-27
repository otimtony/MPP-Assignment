package Lab8.prob6;
import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int result = e1.name.compareTo(e2.name);
        if (result == 0) {
            return Integer.compare(e1.salary, e2.salary);
        }
        return result;
    }
}
