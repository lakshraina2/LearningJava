public class Main {
    public static void main(String[] args){

        String name = "Lakshay";
        char firstLetter = 'L';
        int age = 20;
        double height = 5.9;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("your name starts with %c\n", firstLetter);
        System.out.printf("your age is %d\n", age);
        System.out.printf("your height is %.1f\n", height);
        System.out.printf("employment status: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name,age);

        System.out.printf("%6d\n", age);

    }
}
