package Day12_Assessments.Ecommerce;
import java.io.*;

public class Order implements Serializable{
	int orderId;
	String product;
	int quantity;
	double price;
	
	public Order(int orderId, String product, int quantity, double price) {
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void display() {
        System.out.println(orderId + " | " + product + " | Qty: " + quantity + " | ₹" + price);
    }
}
