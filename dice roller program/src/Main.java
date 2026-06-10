import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args){
        System.out.print("Enter the total number of dice to roll: ");
        int noOfDiceRolls;
        int total = 0;
        noOfDiceRolls = scanner.nextInt();

        while(total==0){
            if(noOfDiceRolls>0){
                System.out.printf("Rolling %d dice\n", noOfDiceRolls);
                for(int i =1; i <= noOfDiceRolls; i++){
                    int x = random.nextInt(1,7);
                    printDie(x);
                    System.out.println("You rolled: " + x);
                    total += x;
                }
            }
            else{
                System.out.println("Number should be greater than 0");
            }
            System.out.printf("You have obtained a total of %d",total);
        }

    }
    static void printDie(int x){
        String die1 = """
                 -------
                |       |
                |   •   |
                |       |
                 -------
                """;
        String die2 = """
                 -------
                | •     |
                |       |
                |     • |
                 -------
                """;
        String die3 = """
                 -------
                | •     |
                |   •   |
                |     • |
                 -------
                """;
        String die4 = """
                 -------
                | •   • |
                |       |
                | •   • |
                 -------
                """;
        String die5 = """
                 -------
                | •   • |
                |   •   |
                | •   • |
                 -------
                """;
        String die6 = """
                 -------
                | •   • |
                | •   • |
                | •   • |
                 -------
                """;

        switch(x){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default -> System.out.print("Invalid Roll");

        }

    }
}

