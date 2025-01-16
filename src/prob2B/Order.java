package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    String orderName;
    List<OrderLine> orderLineList;

    public Order(String name) {
        this.orderName = name;
        orderLineList = new ArrayList<>();
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLineList.add(orderLine);
    }

    public void removeOrderLine(OrderLine orderLine) {
        try {
            orderLineList.get(orderLineList.indexOf(orderLine));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OrderLine not found");
        }
    }

    public void removeOrderLine(int orderLine) {
        try {
            orderLineList.remove(orderLine);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OrderLine not found");
        }
    }

    @Override
    public String toString() {
        return orderLineList.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return order.orderName.equals(orderName);
    }
}
