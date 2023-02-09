package randomTask;

public class Car {

    int doors;
    String type;
    int wheels;
   public static void carInGeneral(){

        System.out.println("These are the main info from parent class");

    }

}

class SUV extends Car{

    public static void main(String[] args) {
        SUV.carInGeneral();
    }
    double height;



    void transfer(){

        System.out.println("This method transfers the height of SUV from SUV class");
    }

}
class SportCar extends SUV{

    int speed;

    void printInfo(){
        System.out.println("This method is inherited from sportCar Class");
    }
        // Write program to inherit class A that has method printF
        // which is static and call or reuse that method into class B
}


