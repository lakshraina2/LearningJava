import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
/*
        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("hello " + name);
*/
        /*
        String c = "";
        while(!c.equals("q")){
            System.out.println("you are stuck");
            System.out.println("press q");
            c = scanner.nextLine();
        }
        System.out.println("noice");
*/
        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age<=0){
            System.out.println("you cant be negative years old");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("you are " + age + " years old");

        int number = 0;
        do{
            System.out.println("pick a number between 1-10: ");
            number  = scanner.nextInt();
        }while(number<1 || number>10);

        scanner.close();
    }
}
