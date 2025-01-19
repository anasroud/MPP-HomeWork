package lab4.C;

import java.util.List;

public class Commissioned extends Employee {
    private double baseSalary;
    private double commission;
    private List<Order> orders;

    public Commissioned(String empId, double baseSalary, double commission, List<Order> orders) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalOrderAmount = orders.stream()
                .filter(order -> order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year)
                .mapToDouble(Order::getOrderAmount)
                .sum();
        return baseSalary + (commission * totalOrderAmount);
    }
}
