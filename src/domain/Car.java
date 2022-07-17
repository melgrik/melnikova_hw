package domain;

import service.CarInterface;

public class Car implements CarInterface, Comparable<Car> {

    public static int count = 0;

    private String brand;

    private String model;

    private int yearOfCreation;

    private int doors;

    private int speed;

    private double fuelConsumption;

    private double engineVolume;

    public Car() {
    }

    public Car(String brand, String model, int yearOfCreation, int doors, int speed, double fuelConsumption, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.doors = doors;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfCreation != car.yearOfCreation) return false;
        if (doors != car.doors) return false;
        if (speed != car.speed) return false;
        if (Double.compare(car.fuelConsumption, fuelConsumption) != 0) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfCreation;
        result = 31 * result + doors;
        result = 31 * result + speed;
        temp = Double.doubleToLongBits(fuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", doors=" + doors +
                ", speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void run() {
        System.out.println("RUN");
    }

    @Override
    public int move() {
        return speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.getSpeed() - o.getSpeed();
    }

}


