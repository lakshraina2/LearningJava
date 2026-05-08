import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age  = scanner.nextInt();

        System.out.println("Enter your CGPA");
        double cgpa = scanner.nextDouble();

        System.out.println("Are you a Student (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("hello " + name);
        System.out.println("you are " + age + "years old");
        System.out.println("your cgpa is " + cgpa);
        System.out.println("Student: " + isStudent);

        double height = 0;
        double width = 0;
        double area = 0;

        System.out.println("Enter your height: ");
        height = scanner.nextDouble();

        System.out.println("Enter your width: ");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("Area is " + area);

        scanner.close();


    }
}
