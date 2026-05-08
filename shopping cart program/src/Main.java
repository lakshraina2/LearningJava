import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;

        System.out.println("menu: ");
        System.out.println("1. Pizza\n2. Pen\n3. Chocolate\n4. Notebook");

        System.out.print("What would you like to order: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to get: ");
        quantity = scanner.nextInt();

        double Total = price * quantity;

        System.out.println("You have bought " + quantity + item+ "/s");
        System.out.print("Your Total is: " + "$" + Total);


        scanner.close();


    }
}
