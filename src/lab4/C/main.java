package lab4.C;
import java.time.LocalDate;
import java.util.Arrays;


public class main {
    public static void main(String[] args) {
        // Create Hourly Employee
        Employee hourlyEmployee = new Hourly("E001", 20.0, 40); // $20/hour, 40 hours/week

        // Create Salaried Employee
        Employee salariedEmployee = new Salaried("E002", 5000.0); // $5000/month

        // Create Commissioned Employee
        Order order1 = new Order("O001", LocalDate.of(2025, 1, 10), 1500.0);
        Order order2 = new Order("O002", LocalDate.of(2025, 1, 15), 2000.0);
        Order order3 = new Order("O003", LocalDate.of(2024, 12, 25), 1000.0); // Not in the specified month
        Employee commissionedEmployee = new Commissioned(
                "E003",
                3000.0, // Base salary
                0.1,    // 10% commission
                Arrays.asList(order1, order2, order3)
        );

        // Test payroll for January 2025
        int testMonth = 1;
        int testYear = 2025;

        // Hourly Employee Paycheck
        System.out.println("Hourly Employee Payroll:");
        Paycheck hourlyPaycheck = hourlyEmployee.calcCompensation(testMonth, testYear);
        hourlyEmployee.print();
        hourlyPaycheck.print();

        // Salaried Employee Paycheck
        System.out.println("\nSalaried Employee Payroll:");
        Paycheck salariedPaycheck = salariedEmployee.calcCompensation(testMonth, testYear);
        salariedEmployee.print();
        salariedPaycheck.print();

        // Commissioned Employee Paycheck
        System.out.println("\nCommissioned Employee Payroll:");
        Paycheck commissionedPaycheck = commissionedEmployee.calcCompensation(testMonth, testYear);
        commissionedEmployee.print();
        commissionedPaycheck.print();
    }
}
