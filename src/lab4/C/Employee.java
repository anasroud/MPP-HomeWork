package lab4.C;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public String getEmpId() {
        return empId;
    }

    // Abstract method to be implemented by derived classes
    public abstract double calcGrossPay(int month, int year);

    // Calculate compensation and return a Paycheck object
    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);

        // Tax calculations
        double fica = grossPay * 0.23;
        double state = grossPay * 0.05;
        double local = grossPay * 0.01;
        double medicare = grossPay * 0.03;
        double socialSecurity = grossPay * 0.075;

        // Calculate net pay
        double netPay = grossPay - (fica + state + local + medicare + socialSecurity);

        // Return an immutable Paycheck object
        return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity, netPay);
    }

    public void print() {
        System.out.println("Employee ID: " + empId);
    }
}


