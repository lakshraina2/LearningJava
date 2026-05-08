import java.util.Scanner;

public class Main {
    public static void main(String[] args){
/*
        String email = "abc123@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7);
        //System.out.println(domain);

        //String x = email.substring(email.indexOf("@"));
        String x = email.substring(email.indexOf("@")+1);

        System.out.println(x);


        System.out.println(username);

 */

        Scanner scanner = new Scanner(System.in);

        String email;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        String username;
        String domain;

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else{
            System.out.println("Your email doesnt contain @");
        }
    }
}
