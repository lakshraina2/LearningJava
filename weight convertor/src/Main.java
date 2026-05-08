import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double weight;
        double newWeight;

        System.out.println("Hello");
        System.out.println("Select your choice (1 or 2)");
        System.out.println("1. lbs to kgs\n2. kgs to lbs");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new Weight in kgs is %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new Weight in lbs is %.2f", newWeight);

        }
        else{
            System.out.println("Please enter a valid choice");
        }

        scanner.close();

    }
}
