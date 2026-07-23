import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n;
        int bal = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Main Menu: \n1. Menu \n2. Check Balance. \n3. Topup Wallet \n4. Exit");
            n = scanner.nextLine();
            
            if(n.equals("1")){
                System.out.println("This is the menu.");
            }
            
            else if(n.equals("2")) {
                System.out.println(bal + " is your balance.");
            }

            else if(n.equals("3")) {
                System.out.println("Enter the amount to Topup.");
                bal = bal + Integer.parseInt(scanner.nextLine());
                System.out.println("Your new balance is: " + bal);
            }

            System.out.println("\n");

        } while (!n.equals("4"));
        scanner.close();
    }
} 