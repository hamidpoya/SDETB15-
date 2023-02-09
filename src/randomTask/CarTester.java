package randomTask;

public class CarTester {

    public static void main(String[] args) {
        Car car = new Car();
        car.doors = 4;
        car.type = "SUV, Sedan, VAN";
        car.carInGeneral();
        System.out.println(car.doors);
        System.out.println(car.type);
        System.out.println("**************");
        SUV suv = new SUV();
        suv.height =234;

        SportCar sportcar = new SportCar();
        sportcar.speed = 200;
        sportcar.type = "BUGATTI";
        sportcar.doors = 2;
        sportcar.wheels = 4;
        sportcar.height = 30;


        SUV.carInGeneral();








    }
}
