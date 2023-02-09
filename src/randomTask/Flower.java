package randomTask;

public class Flower {
    //inside the class we have attributes / or some might say properties

    // in the form of variables

    String color, type, name;
    int price;
   static boolean pretty = true;//is a class level variable
    //

    //beside the atrributes we can define the behavior

    void smell(){

        System.out.println(name+" smells good");
    }
    void bloom(){
        System.out.println(name+" flowers blooms");
    }
    void grow(){
        System.out.println(name+" flowers grows");
    }//we can create multiple objects




}
