package randomTask;

public class Garden {

    public static void main(String[] args) {

        // new object is just created here...like one below
        //left is variable declaration and right side is the
        //flower 1 is a reference variable
        //new creates an object
        //right side createaion of the object
        //the first Flower is a non primitive data type
        //flower1 is a variable name that refers to an object
        //
       Flower flower1 = new Flower();//object 1
        //accessing variables of Flower class
        System.out.println(Flower.pretty);// correct way to access static variable
        flower1.name= "Hibiscus";
        flower1.color = "Red";
        flower1.price= 5;
        flower1.pretty=false;//not the right way to access static variable but it is possible
       // System.out.println(flower1.pretty);
        System.out.println("Hibiscus preety? " +flower1.pretty);
       // flower1.size = error since variable size is not declared/exist in flower class


        //accessing methods of Flower Class
        flower1.bloom();
        flower1.grow();
        flower1.smell();


        System.out.println("Creating second object of the flower class");
       Flower flower2= new Flower();//object 2

        flower2.name= "Rose";
        flower1.color = "Blue";
        flower2.price= 15;
        flower2.price=18;
        flower2.bloom();
        flower2.grow();
        flower2.smell();
        //flower2.stinks error - since method is not defined in the flower class
        System.out.println(flower2.price);
        Flower flower3 = new Flower();//object 3

        //if you want to do something with the object actually work with the object
        //now we need to assing it  to some variable or reffer it to







    }

}
