import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand = random.nextInt(1, 11);
        int number;
        int attempts = 0;
        System.out.println("Number Guessing Game");

        do{
            System.out.println("Guess a number between 1-100");
            System.out.print("Enter a guess: ");
            number = scanner.nextInt();
            attempts++;
            if(number < rand){
                System.out.println("Too Low try again");
            }
            else{
                System.out.println("Too High try again");
            }
        }while(number != rand);

        System.out.println("you won");
        System.out.println("it took you " + attempts + " attempts");

        scanner.close();
    }
}
