import java.util.ArrayList;
import java.util.List;

public class Car {
    private int fuelConsumption;
    private int fuelAmount;
    private List<RearMirror> mirrors;
    private List<Tire> tire;
    private String brand;
    private String serialNumber;
    private String color;
    private int tankVolume;
    private int remainingRange;

    public Car(int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color, int tankVolume) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.tankVolume = tankVolume;
        this.mirrors = new ArrayList<>();
        this.tire = new ArrayList<>();
    }

    public List<Tire> getTire() {
        return tire;
    }

    public void setTire(List<Tire> tire) {
        this.tire = tire;
    }

    public void addMirror(RearMirror mirror) {
        mirrors.add(mirror);
    }

    public void listMirrors() {
        for (RearMirror mirror : mirrors) {
            System.out.println(mirror);
        }
    }


    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public void drive() {
        this.fuelAmount -= fuelConsumption;
        System.out.println("I am driving");
    }

    public void breakCar() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelAmount > tankVolume / 10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void hupe(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public int getRemainingRange() {
        return remainingRange;
    }

    public void setRemainingRange(int remainingRange) {
        this.remainingRange = remainingRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
