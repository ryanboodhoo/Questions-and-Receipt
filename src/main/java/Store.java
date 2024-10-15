import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Store {
    public static void printReceipt() {
        Scanner scanner = new Scanner(System.in);

        // Scan product name
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        // Scan price
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        // Scan quantity
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total cost
        double totalCost = price * quantity;

        // Get the current date and format it
        SimpleDateFormat longFormat = new SimpleDateFormat("MMMM dd, yyyy HH:mm:ss zzzz");


        // Print the receipt
        System.out.println("\n----------------------------------------------");
         System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + totalCost);
        System.out.println("Thank You have a good day");
        System.out.println("Purchased on : " + new Date());
        System.out.println("\n----------------------------------------------");

        scanner.close();
    }

    public static void main(String[] args) {
        printReceipt();
    }
}
