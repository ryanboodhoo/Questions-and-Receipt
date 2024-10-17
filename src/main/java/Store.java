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

        // Get the current date
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        String currentDate = sdf.format(new Date());

        // Print the receipt
        System.out.println("----------------------------------------------");
        System.out.printf("%-5s %5s %10s %10s\n", "Name", "Qty", "Price", "Total");
        System.out.println("----------------------------------------------");
        System.out.printf("%-5s %4d %11s %10.2f\n", productName, quantity, "$" + String.format("%.2f", price),totalCost);
        System.out.println("\n        Thank you. Come again!!!\n");
        System.out.println("Purchased on: " + currentDate);
        System.out.println("----------------------------------------------");
    }
}
    public static void main(String[] args) {
        Store.printReceipt();
    }



