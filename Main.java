 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bal = 0,count = 0, a, b;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("<======Main Menu======> \n1. Menu \n2. check Balance \n3. Topup Wallet \n4. Exit\n<=====================>");
            System.out.print("Enter your choice: ");
            b=scanner.nextInt();
            switch (b) {
                case 1:
                    System.out.println("<======Menu======> \n1. Item 1 \n2. Item 2 \n3. Item 3 \n4. Back\n5. Pay Now\n<=================>");
                    boolean run=true;
                    while(run){
                        System.out.println("Items added: " + count);
                        System.out.print("Enter your choice: ");
                        a=scanner.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Item 1 selected");
                                count++;
                                break;
                            case 2:
                                System.out.println("Item 2 selected");
                                count++;
                                break;
                            case 3:
                                System.out.println("Item 3 selected");
                                count++;
                                break;
                            case 4:
                                run=false;
                                break;
                            case 5:
                                if (count > 0 && bal >= count) {
                                    System.out.println("Payment successful! You have purchased " + count + " items.");
                                    count = 0;
                                    break;}
                                else if(bal < count){
                                    System.out.println("Insufficient balance. Please top up your wallet.");
                                } 
                                else {
                                    System.out.println("No items selected for payment.");
                                }
                                break;
                            default:
                                System.out.println("Invalid option. Please try again.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Your balance is: " + bal);
                    break;
                case 3:
                    System.out.print("Enter the amount to top up: ");
                    int topupAmount = scanner.nextInt();
                    bal += topupAmount;
                    System.out.println("Wallet topped up successfully!");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }


        }

        scanner.close();
    }
} 