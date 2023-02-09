package randomTask;

public class StringMethods {
    public static void main(String[] args) {


        String str= "Hello";

        System.out.println(str.length());//5
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1)); //e

        String newString = str.concat("friends");
        System.out.println(newString); //Hello friends

        System.out.println(str);//Hello
        System.out.println(str.toLowerCase());
    }
}
