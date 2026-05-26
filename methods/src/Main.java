public class Main {
    public static void main(String[] args){
        /*System.out.println("Happy birthday to you");
        System.out.println("happy birthday dear you");
        System.out.println("You are X years old");
        System.out.println("Happy birthday to you \n");
         */
        /*
        String name = "Lakshay";
        int age = 20;
        happyBirthday(name,age);

         */
        //double result = square(2);
        //System.out.println(result);

        int age = 12;
        if(ageCheck(age)){
            System.out.println("you may sign up");
        }
        else{
            System.out.println("you must be 18+");
        }


    }
    static void happyBirthday(String name,int age) {
        System.out.println("Happy birthday to you");
        System.out.printf("happy birthday dear %s\n",name);
        System.out.printf("You are %d years old\n",age);
        System.out.println("Happy birthday to you \n");
    }

    static double square(double x){
        return x * x;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }


}

