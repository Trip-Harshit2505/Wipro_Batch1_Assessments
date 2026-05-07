package Day12_Assessments.FoodDelivery;
import java.io.*;

class Order implements Serializable {
    int orderId;
    String item;
    int quantity;
    double price;

    public Order(int orderId, String item, int quantity, double price) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println(orderId + " | " + item + " | Qty: " + quantity + " | ₹" + price);
    }
}
