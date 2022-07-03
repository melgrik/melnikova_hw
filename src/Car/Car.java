package Car;

public class Car {

    public static int count = 0;

    private String brand;

    private String model;

    private int yearOfCreation;

    private int doors;

    private int power;

    private double fuelConsumption;

    private double engineVolume;

    public Car() {
    }

//   // public Car(String brand) {
//        this.brand = brand;
//    }

    public Car(String brand, String model, int yearOfCreation, int doors, int power, double fuelConsumption, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.doors = doors;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
        if (power != car.power) return false;
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
        result = 31 * result + power;
        temp = Double.doubleToLongBits(fuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Car.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", doors=" + doors +
                ", power=" + power +
                ", fuelConsumption=" + fuelConsumption +
                ", engineVolume=" + engineVolume +
                '}';
    }


}
