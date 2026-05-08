import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        double temp = 20;
        boolean SunnyWeather = false;

        if(temp >= 10 && temp <=20){
            System.out.println("good temp");
        }
        if(temp<=20 && !SunnyWeather){
            System.out.println("weather is cold");
        }
        if(temp <=20 || SunnyWeather){
            System.out.println("ok");
        }

         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        if(name.length()>12 || name.length()<4){
            System.out.println("username must be between 4-12 characters");
        }
        else if(name.contains(" ") || name.contains("_")){
            System.out.println("username must not contain space or underscore");
        }
        else{
            System.out.println("welcome " + name);
        }

        scanner.close();
    }
}
