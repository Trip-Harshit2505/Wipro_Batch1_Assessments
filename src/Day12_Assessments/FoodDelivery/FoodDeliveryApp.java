package Day12_Assessments.FoodDelivery;
import java.util.*;
import java.io.*;

public class FoodDeliveryApp {

    static final String PATH = "src/Day12_Assessments/FoodDelivery/";
    static Scanner sc = new Scanner(System.in);

    public static void initMenu() throws IOException {
        File file = new File(PATH + "menu.txt");

        if (!file.exists()) {
            FileWriter fw = new FileWriter(file);
            fw.write("Pizza - 200\nBurger - 100\nPasta - 150\n");
            fw.close();
        }
    }

    public static void viewMenu() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(PATH + "menu.txt"));

        String line;
        System.out.println("\n--- MENU ---");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void saveOrder(Order order) throws IOException {
        File file = new File(PATH + "orders.dat");
        FileOutputStream fos = new FileOutputStream(file, true);

        ObjectOutputStream oos;

        if (file.length() == 0) {
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
                if (o != null) {
                    o.display();
                }
            }
        } catch (EOFException e) {}

        ois.close();
    }

    public static void saveDeliveryLog(int orderId, String status) throws IOException {
        FileWriter fw = new FileWriter(PATH + "delivery.txt", true);
        fw.write("OrderID: " + orderId + " | Status: " + status + "\n");
        fw.close();
    }

    public static void viewDeliveryLogs() throws IOException {
        File file = new File(PATH + "delivery.txt");

        if (!file.exists()) {
            System.out.println("No delivery logs found!");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        System.out.println("\n--- Delivery Logs ---");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {

        new File(PATH).mkdirs();
        initMenu();

        while (true) {
            System.out.println("\n1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Orders");
            System.out.println("4. View Delivery Logs");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewMenu();
                    break;

                case 2:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Item: ");
                    String item = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Order order = new Order(id, item, qty, price);
                    saveOrder(order);

                    saveDeliveryLog(id, "Order Placed");

                    System.out.println("Order Placed Successfully!");
                    break;

                case 3:
                    viewOrders();
                    break;

                case 4:
                    viewDeliveryLogs();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
