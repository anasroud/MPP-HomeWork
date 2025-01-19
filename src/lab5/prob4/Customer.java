package lab5.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Order> orders;

    // Constructor is package-private to restrict instantiation
    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    void addOrder(Order order) {
        orders.add(order);
    }
}

