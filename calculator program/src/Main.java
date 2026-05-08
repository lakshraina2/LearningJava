import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        char operator;
        double result = 0;
        boolean isValid = true;

        System.out.print("Enter first number: ");
        x = scanner.nextDouble();

        System.out.println("What do you wanna do (+,-,*,/,^)");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        y = scanner.nextDouble();

        switch(operator){
            case '+' -> result = x+y;
            case '-' -> result = x-y;
            case '*' -> result = x*y;
            case '/' -> {
                if(y == 0){
                    System.out.println("Can't divide by zero");
                    isValid = false;
                }
                else{
                    result = x/y;
                }
            }
            case '^' -> result = Math.pow(x,y);
            default -> {
                System.out.println("Invalid Choice");
                isValid = false;
            }
        }
        if(isValid){
            System.out.println("The Result is " + result);
        }



        scanner.close();
    }
}
