package lab5.prob4;

public class CustOrderFactory {
    private static int orderIdCounter = 1;

    private CustOrderFactory() {}

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    public static Order createOrder(Customer customer) {
        Order order = new Order(orderIdCounter++, customer);
        customer.addOrder(order);
        return order;
    }

    public static Item createItem(String name, double price) {
        return new Item(name, price);
    }

    public static void addItemToOrder(Order order, Item item) {
        order.addItem(item);
    }
}
