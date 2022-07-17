package Util;
import domain.Car;
import java.util.Random;
import static service.CarInterface.*;

public class CarUtil {

    public static Car[] generateCars(int arrayCapacity) {
       Car[] arrayCar = new Car[arrayCapacity];
        for (int i = 0; i < arrayCapacity; i++) {
          Car car = new Car();

          car.setBrand(generateBrand());
          car.setModel(generateModel());
          car.setYearOfCreation(generateYearOfCreation());
          car.setDoors(generateDoors());
          car.setSpeed(generateSpeed());
          car.setFuelConsumption(generateFuelConsumption());
          car.setEngineVolume(generateEngineVolume());

          arrayCar[i] = car;
          System.out.println(arrayCar[i]);
        }
       return (arrayCar);
    }

    private static String generateBrand() {
        String [] arrayBrand = {CAR_NAME1,CAR_NAME2, CAR_NAME3, CAR_NAME4, CAR_NAME5};
        int n = random(arrayBrand);
        return(arrayBrand[n]);
    }

    private static String generateModel() {
        String [] arrayModel = {"M1","M2","M3","M4", "M5"};
        int n = random(arrayModel);
        return(arrayModel[n]);
    }

    private static int generateYearOfCreation() {
        Integer[] arrayYearOfCreation = {2002, 2010, 2015, 2022, 1998};
        int n = random(arrayYearOfCreation);
        return(arrayYearOfCreation[n]);
    }

    private static int generateDoors() {
        Integer[] arrayDoors = {2, 3, 4, 5, 6};
        int n = random(arrayDoors);
        return(arrayDoors[n]);
    }

    private static int generateSpeed() {
        Integer[] arraySpeed = {60, 70, 90, 100, 120};
        int n = random(arraySpeed);
        return(arraySpeed[n]);
    }

    private static Double generateFuelConsumption() {
        Double[] arrayFuelConsumption= {10.0, 9.6, 8.2, 15.5, 18.0};
        int n = random(arrayFuelConsumption);
        return(arrayFuelConsumption[n]);
    }

    private static Double generateEngineVolume() {
        Double[] arrayEngineVolume= {10.0, 9.6, 8.2, 15.5, 18.0};
        int n = random(arrayEngineVolume);
        return(arrayEngineVolume[n]);
    }

    private static <T> int random(T [] array) {
        Random random = new Random();
        int n = random.nextInt(array.length);
        return (n);

    }
}
