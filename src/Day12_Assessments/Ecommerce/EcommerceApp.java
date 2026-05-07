package Day12_Assessments.Ecommerce;

import java.io.*;
import java.util.*;

public class EcommerceApp {
	
	static final String PATH = "src/Day12_Assessments/Ecommerce/";

    static Scanner sc = new Scanner(System.in);

    //Serialization
    public static void saveOrder(Order order) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH + "orders.dat", true);
        ObjectOutputStream oos;

        //Prevent header issue when appending
        if (new File(PATH + "orders.dat").length() == 0) {
            oos = new ObjectOutputStream(fos);
        } else {
            oos = new ObjectOutputStream(fos) {
                protected void writeStreamHeader() throws IOException {
                    reset();
                }
            };
        }

        oos.writeObject(order);
        oos.close();
        fos.close();
    }

    public static void generateInvoice(Order order) throws IOException {
        FileWriter fw = new FileWriter(PATH + "invoice_" + order.orderId + ".txt");

        fw.write("----- INVOICE -----\n");
        fw.write("Order ID: " + order.orderId + "\n");
        fw.write("Product: " + order.product + "\n");
        fw.write("Quantity: " + order.quantity + "\n");
        fw.write("Total Price: ₹" + order.price + "\n");

        fw.close();
    }

    //Save Shipping Details
    public static void saveShipping(int orderId, String name, String address) throws IOException {
        FileWriter fw = new FileWriter(PATH +"shipping.txt", true);
        fw.write("OrderID: " + orderId + " | Name: " + name + " | Address: " + address + "\n");
        fw.close();
    }

    //View All Orders
    public static void viewOrders() throws Exception {
        File file = new File(PATH + "orders.dat");

        if (!file.exists()) {
            System.out.println("No orders found!");
            return;
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        System.out.println("\n--- Orders ---");
        try {
            while (true) {
            	Order o = (Order) ois.readObject();
            	if(o != null) { 		
            		o.display();
            	}
            }
        } catch (EOFException e) {
        }

        ois.close();
    }

    //Main Menu
    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("\n1. Place Order");
            System.out.println("2. View Orders");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Product: ");
                    String product = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Order order = new Order(id, product, qty, price);

                    saveOrder(order);
                    generateInvoice(order);

                    System.out.print("Enter Customer Name: ");
                    String name = sc.next();

                    System.out.print("Enter Address: ");
                    String address = sc.next();

                    saveShipping(id, name, address);

                    System.out.println("Order Placed Successfully!");
                    break;

                case 2:
                    viewOrders();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
