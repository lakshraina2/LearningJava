import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        int choice;
        boolean isRunning = true;

        double balance = 0;

        while(isRunning){
            System.out.println("****************");
            System.out.println("Banking Program");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextInt();

            switch(choice){
                case 1 -> balance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("Thank you for using our service");
        scanner.close();

    }

    //balance
    static void balance(double balance){
        System.out.println("****************");
        System.out.println("$ " + balance);
    }
    //deposit
    static double deposit(){
        double amount;
        System.out.print("How much would you like to deposit: ");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    //withdraw
    static double withdraw(double balance){
        double amount;
        System.out.print("How much would you like to withdraw:");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("You don't have that much money");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
