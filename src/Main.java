import domain.Car;
import Util.CarUtil;
import service.CarInterface;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car[] cars = CarUtil.generateCars(10);
        System.out.println(cars.toString());

        CarInterface carInterface = new Car();

        carInterface.run();
        carInterface.move();

        Arrays.sort(cars);
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}

