package lab9b.prob8;
import java.util.ArrayList;
import java.util.List;

public class Main {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
	private Product findProduct(String prodName) {
		return orderItems.stream()
				.map(OrderItem::getProduct) // Map OrderItem to Product
				.filter(product -> product != null && prodName.equals(product.getProductName())) // Filter by product name
				.findFirst() // Get the first matching product
				.orElse(null); // Return null if no product is found
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
