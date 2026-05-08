public class Main {

    public static void main(String[] args){

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 100;

        if(isStudent){
            if(isSenior){
                System.out.println("you are a senior you get 20% discount");
                System.out.println("you are a student you get 10% discount");
                price *= 0.7;
            }
            else{
                System.out.println("you are a student you get 10% discount");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("you are a senior you get 20% discount");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }
        System.out.println("the price of the ticket is: " + price);
    }
}
