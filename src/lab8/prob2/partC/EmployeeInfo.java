package lab8.prob2.partC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY};
    public void sort(List<Employee> emps,  SortMethod method) {
        Collections.sort(emps, (e1,e2) ->
        {
            if(method == SortMethod.BYNAME) {
                // Same fix
                int nameCompare = e1.name.compareTo(e2.name);
                if(nameCompare != 0) {
                    return nameCompare;
                }
                return Double.compare(e1.salary, e2.salary);
            } else {
                if(e1.salary == e2.salary) return 0;
                else if(e1.salary < e2.salary) return -1;
                else return 1;
            }
        });
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Tim", 50000));
        emps.add(new Employee("Andy", 60000));
        emps.add(new Employee("Joe", 20000));
        EmployeeInfo ei = new EmployeeInfo();
        ei.sort(emps, SortMethod.BYNAME);
        System.out.println(emps);
        //same instance
        ei.sort(emps, SortMethod.BYSALARY);
        System.out.println(emps);
    }
}
