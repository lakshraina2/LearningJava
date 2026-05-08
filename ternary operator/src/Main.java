import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //int score = 70;
/*
        if(score>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

 */
        /*
        String passOrFail = (score>=60) ? "Pass": "Fail";
        System.out.println(passOrFail);

        int number = 4;
        String evenOrOdd = (number%2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

         */
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temp: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to celsius or fahrenheit (c or f)");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp-32) * 5/9 : (temp * 9/5) + 32;

        System.out.println(newTemp);


        scanner.close();
    }
}
