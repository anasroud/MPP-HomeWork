package prob2B;

public class TestClass {
    public static void main(String[] args) {
        Order o = new Order("1");
        OrderLine ol = new OrderLine(1, o);
        o.addOrderLine(ol);
        OrderLine ol2 = new OrderLine(2, o);
        o.addOrderLine(ol2);
        System.out.println(o);
        o.orderLineList.remove(ol);
        System.out.println(o);
    }
}
