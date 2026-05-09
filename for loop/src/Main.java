import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("which numbers table do you want: ");
        int x = scanner.nextInt();

        System.out.print("till how much: ");
        int y = scanner.nextInt();

        System.out.printf("Table of %d\n",x);

        for(int i = 1; i<=y; i++){
            int result = x*i;
            System.out.printf("%d * %d = %d\n",x,i, result);
        }
    }
}
