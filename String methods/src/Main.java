public class Main {
    public static void main(String[] args){

        String name = "password";
        String password = "password";
        //int length = name.length();
        //char letter = name.charAt(0);
        //int index = name.indexOf("e");
        //int lastIndex = name.lastIndexOf("e");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("e", "v");

        //System.out.println(name.isEmpty());
/*
        if(!name.isEmpty()){
            if(name.contains(" ")){
                System.out.println("hello " + name);
                System.out.println("your name contains spaces");
            }
            else{
                System.out.println("your name doesnt have spaces");
            }
        }
        else{
                System.out.println("you dont have a name");
            }
        }
*/

        if(name.equals(password)){
            System.out.println("name cant be equal to the password");
        }
        else{
            System.out.println("hello " + name);
        }
    }
}


