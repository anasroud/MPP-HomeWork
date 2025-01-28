package lab8.prob2.partA;
import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.name.compareTo(e2.name) != 0) {
            return e1.name.compareTo(e2.name);
        }
        return Double.compare(e1.salary, e2.salary);
    }
}