public class Main {
    public static void main(String[] args){

        //break = stops the loop
        //continue = skips the current iteration
        for(int i = 1; i<=10; i++){
            if(i==5){
                continue;
            }
            else if(i==8){
                break;
            }
            System.out.println(i);
        }
    }
}
