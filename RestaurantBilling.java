import java.util.Scanner;

public class RestaurantBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"Burger", "Pizza", "Pasta", "Sandwich"};
        int[] prices = {100, 200, 150, 80};

        int choice, quantity;
        int total = 0;
        char more;
   
        do {
            System.out.println("\n--- MENU ---");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
            }

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= items.length) {
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                int cost = prices[choice - 1] * quantity;
                total += cost;

                System.out.println("Added: " + items[choice - 1] + " x " + quantity);
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to order more? (y/n): ");
            more = sc.next().charAt(0);

        } while (more == 'y' || more == 'Y');

        System.out.println("\n--- FINAL BILL ---");
        System.out.println("Total Amount: Rs." + total);
        System.out.println("Thank you!");

        sc.close();
    }
}