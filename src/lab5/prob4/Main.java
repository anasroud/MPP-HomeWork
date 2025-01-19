package lab5.prob4;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustOrderFactory.createCustomer("John Doe");
        Order order1 = CustOrderFactory.createOrder(customer);
        Item item1 = CustOrderFactory.createItem("Laptop", 1200.0);
        Item item2 = CustOrderFactory.createItem("Mouse", 25.0);
        CustOrderFactory.addItemToOrder(order1, item1);
        CustOrderFactory.addItemToOrder(order1, item2);

        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println("Order ID: " + order.getOrderId());
            for (Item item : order.getItems()) {
                System.out.println("  Item: " + item.getName() + ", Price: $" + item.getPrice());
            }
        }
    }
}
