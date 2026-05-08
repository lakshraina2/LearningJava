import java.util.Scanner;

public class Main {

    public static void main(String[] args){
/*
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result = Math.pow(2,3);
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(9);
        System.out.println(result);

        result = Math.round(5.79);
        System.out.println(result);

        result = Math.ceil(3.12);
        System.out.println(result);

        result = Math.floor(5.6);
        System.out.println(result);

        result = Math.max(4,5);
        System.out.println(result);

        result = Math.min(4,5);
        System.out.println(result);
*/

        Scanner scanner = new Scanner(System.in);
/*
        double a;
        double b;
        double h;

        System.out.println("Enter length of side a:");
        a = scanner.nextDouble();

        System.out.println("Enter length of side a:");
        b = scanner.nextDouble();

        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("the length of hypo is:" + h);

*/

        double r;
        r = scanner.nextDouble();

        double circum = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r,2);
        double vol = (4.0/3.0) * Math.PI * Math.pow(r,3);

        System.out.println(circum);
        System.out.println(area);
        System.out.println(vol);
        scanner.close();
    }
}
