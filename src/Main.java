import Car.Car;
import Util.CarUtil;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Volkswagen", "Passat", 2003, 4, 193, 15.5, 2.8);
        Car car2 = new Car("Mazda", "CX5", 2012, 4, 156, 11.5, 2.0);
        Car car3 = new Car("Lexus", "RX330", 2009, 4, 220, 15.5, 3.3);
        Car car4 = new Car("Hyundai", "Creta", 2017, 4, 145, 9.5, 2.0);
        Car car5 = new Car("Volkswagen", "Tiguan", 2019, 4, 180, 12.5, 2.0);
//        Car car6 = new Car("Lexus");
//        Car car7 = new Car("Infinity");
//        Car car8 = new Car("Porsche");
//        Car car9 = new Car("Ferrari");
//        Car car10 = new Car("BMW");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
//        System.out.println(car6.toString());
//        System.out.println(car7.toString());
//        System.out.println(car8.toString());
//        System.out.println(car9.toString());
//        System.out.println(car10.toString());

        int [] array = new int [10];
    System.out.println(CarUtil.printArray(array));
    }
}
