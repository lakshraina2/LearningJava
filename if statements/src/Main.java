import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.println("you didnt write your name");
        }
        else{
            System.out.println("hi " + name);
        }

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        //group 2
        if(age>=50){
            System.out.println("you are old man");
        }
        else if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age < 0){
            System.out.println("Enter an valid age");
        }
        else{
            System.out.println("you are not an adult yet");
        }

        scanner.close();
    }
}
