import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double Principle = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble() /  100;

        System.out.print("Enter the amount of times interest to be compounded per year: ");
        int n = scanner.nextInt();

        System.out.print("Enter the total time: ");
        int time = scanner.nextInt();

        double amount = Principle * Math.pow( (1+(rate/n)) , (n*time));
        char c = '$';

        System.out.printf("Your total amount after %d years is: %c %.2f ", time, c, amount);


        scanner.close();


    }
}
