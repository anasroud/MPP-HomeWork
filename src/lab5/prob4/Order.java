package lab5.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final int orderId;
    private final Customer customer;
    private final List<Item> items;

    Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    void addItem(Item item) {
        items.add(item);
    }
}

