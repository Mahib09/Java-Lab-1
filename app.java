import java.util.EmptyStackException;
import java.util.Scanner;

public class app {
    public static void main(String arg[]) {
        System.out.println("Brampton Hamburgers");
        int choice;
        double grandtotal = 0;
        double total = 0;
        double tax = 0.13;
        double subtotal = 0;
        double veggieBurger = 5.95;
        double deluxeVeggieBurger = 7.95;
        double chickenBurger = 6.45;
        double cheeseChickenBurger = 8.50;
        double cheeseBaconBurger = 9.25;
        double deluxeBaconBurger = 10.95;
        double healthyOrganicBurger = 12.45;
        double discount1 = 0.05;
        double discount2 = 0.1;
        System.out.println("Types of Burger" + "\t\t\tPrice");
        System.out.println("1. Veggie Burger" + "\t\t$5.95");
        System.out.println("2. Deluxe Veggie Burger" + "\t\t$7.95");
        System.out.println("3. Chicken Burger" + "\t\t$6.45");
        System.out.println("4. Cheese Chicken Burger" + "\t$8.50");
        System.out.println("5. Cheese Bacon Burger" + "\t\t$9.25");
        System.out.println("6. Deluxe Bacon Burger" + "\t\t$10.95");
        System.out.println("7. Healthy Organic Burger" + "\t$12.45");
        System.out.println("8. Quit");
        for (int i = 0; i <= 4; i++) {
            subtotal = 0;
            while (true) {

                Scanner in = new Scanner(System.in);
                System.out.print("Enter Your Choice of the menu:");
                choice = in.nextInt();
                double quantity = 0;
                if (choice <= 0 || choice > 8) {
                    throw new RuntimeException("Choice Not Available");
                }
                if (choice == 1) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = veggieBurger * quantity + subtotal;

                } else if (choice == 2) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = deluxeVeggieBurger * quantity + subtotal;

                } else if (choice == 3) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = chickenBurger * quantity + subtotal;

                } else if (choice == 4) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = cheeseChickenBurger * quantity + subtotal;

                } else if (choice == 5) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = cheeseBaconBurger * quantity + subtotal;

                } else if (choice == 6) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = deluxeBaconBurger * quantity + subtotal;

                } else if (choice == 7) {
                    Scanner qty = new Scanner(System.in);
                    System.out.print("Enter the quantity: ");
                    quantity = qty.nextInt();
                    subtotal = healthyOrganicBurger * quantity + subtotal;

                } else if (choice == 8) {
                    break;
                }
            }
            subtotal = subtotal * tax + subtotal;
            if (subtotal > 50) {
                subtotal = total - total * discount1;
            } else if (subtotal > 100) {
                subtotal = total - total * discount2;
            }
            grandtotal = subtotal + grandtotal;

            System.out.printf("Your Total is: %.2f \n", subtotal);
        }
        System.out.printf("Your Total is: %.2f",grandtotal);

    }
}
