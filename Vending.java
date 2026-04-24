import java.util.*;

public class Vending {
    public static void main(String[] args) {

        int totalPrice = 0, trayNumber;
        Scanner sc = new Scanner(System.in); // FIX: only once

        do {
            System.out.println("\nTray 1 : Beverages");
            System.out.println("Tray 2 : Snacks");
            System.out.println("Tray 3 : Chocolates");
            System.out.print("Select tray (1/2/3/0 Exit): ");

            trayNumber = sc.nextInt();

            switch (trayNumber) {

                case 1:
                    char stay1;
                    do {
                        System.out.println("a. Coke");
                        System.out.println("b. Pepsi");
                        System.out.println("c. Redbull");
                        System.out.print("Select (a/b/c): ");

                        char beverage = sc.next().charAt(0);

                        if (beverage == 'a') {
                            totalPrice += 50;
                        } else if (beverage == 'b') {
                            totalPrice += 45;
                        } else if (beverage == 'c') {
                            totalPrice += 100;
                        } else {
                            System.out.println("Invalid Item");
                        }

                        System.out.print("Stay in same tray? (Y/N): ");
                        stay1 = sc.next().charAt(0);

                    } while (stay1 == 'y' || stay1 == 'Y');
                    break;

                case 2:
                    char stay2;
                    do {
                        System.out.println("a. Lays");
                        System.out.println("b. Balaji");
                        System.out.println("c. Doritos");
                        System.out.print("Select (a/b/c): ");

                        char snack = sc.next().charAt(0);

                        if (snack == 'a') {
                            totalPrice += 30;
                        } else if (snack == 'b') {
                            totalPrice += 25;
                        } else if (snack == 'c') {
                            totalPrice += 40;
                        } else {
                            System.out.println("Invalid Item");
                        }

                        System.out.print("Stay in same tray? (Y/N): ");
                        stay2 = sc.next().charAt(0);

                    } while (stay2 == 'y' || stay2 == 'Y');
                    break;

                case 3:
                    char stay3;
                    do {
                        System.out.println("a. Dairy Milk");
                        System.out.println("b. Snickers");
                        System.out.println("c. KitKat");
                        System.out.print("Select (a/b/c): ");

                        char chocolate = sc.next().charAt(0);

                        if (chocolate == 'a') {
                            totalPrice += 20;
                        } else if (chocolate == 'b') {
                            totalPrice += 15;
                        } else if (chocolate == 'c') {
                            totalPrice += 25;
                        } else {
                            System.out.println("Invalid Item");
                        }

                        System.out.print("Stay in same tray? (Y/N): ");
                        stay3 = sc.next().charAt(0);

                    } while (stay3 == 'y' || stay3 == 'Y');
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid tray number!");
            }

        } while (trayNumber != 0);

        System.out.println("Total Price: " + totalPrice);

        sc.close();
    }
}