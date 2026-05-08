public class Main {

    public static void main(String[] args){

        //variable = container to store values
        //primitive and reference

        int age = 4;
        int year = 2026;

        System.out.println(age);
        System.out.println("the year is "+ year);

        double temp = 45.3;
        double cgpa = 7.5;
        System.out.println(temp);
        System.out.println("the cgpa is "+cgpa);


        char grade = 'A';
        char symbol = '$';

        System.out.println(grade);
        System.out.println(symbol);

        boolean isStudent = true;
        boolean forSale = true;

        System.out.println(isStudent);
        if(isStudent){
            System.out.println("you are a studnet");
        }
        else{
            System.out.println("you are not a student");
        }



        String name = "LetsGetDev";
        String number = "234566";
        String car = "Toyota";

        System.out.println(name);
        System.out.println(number);

        System.out.println("your choice is "+ car);

        if(forSale){
            System.out.println("there is a "+car+" for sale");
        }
        else{
            System.out.println("the " + car + "is not for sale");
        }



        boolean khushuLovesMe = false;

        if(khushuLovesMe){
            System.out.println("Lakshay also loves khushu");
        }
        else{
            System.out.println("Lakshay still loves khushu");
        }

        
    }
}
