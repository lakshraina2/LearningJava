import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the day of the week: ");
        String day = scanner.nextLine().toUpperCase();

/*
        switch(day){
            case "MONDAY" -> System.out.println("Today is a weekday");
            case "TUESDAY" -> System.out.println("Today is a weekday");
            case "WEDNESDAY" -> System.out.println("Today is a weekday");
            case "THURSDAY" -> System.out.println("Today is a weekday");
            case "FRIDAY" -> System.out.println("Today is a weekday");
            case "SATURDAY" -> System.out.println("YAY TODAY IS A HOLIDAY");
            case "SUNDAY" -> System.out.println("YAY TODAY IS A HOLIDAY");
            default -> System.out.println(day + " is not a day");
        }

 */
        switch(day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" ->
                    System.out.println("Today is a weebday");
            case "SATURDAY", "SUNDAY" ->
                    System.out.println("YAY TODAY IS A HOLIDAY");
            default -> System.out.println(day + " is not a day");
        }
    }
}
