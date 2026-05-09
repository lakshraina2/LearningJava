import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=10; j++){
                System.out.print(j + " ");
            }
            System.out.println();

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int col = scanner.nextInt();

        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("$");
            }
            System.out.println();

        }
    }
}
