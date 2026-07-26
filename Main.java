 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n;
        int bal = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("<=====Main Menu=====> \n1. Menu \n2. Check Balance \n3. Topup Wallet \n4. Exit\n<==================>");
            System.out.print("Choose an option: ");
            n = scanner.nextLine();
            System.out.println();
            switch(n) {
                case "1":
                    System.out.println("This is the menu.");
                    break;
                case "2":
                    System.out.println(bal + " is your balance.");
                    break;
                case "3":
                    System.out.print("Enter the amount to Topup: ");
                    bal = bal + scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Your new balance is: " + bal);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!n.equals("4"));
        scanner.close();
    }
} 