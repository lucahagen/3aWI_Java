public class Car {
    private int fuelConsumption;
    private int fuelAmount;
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

    public void remainingRange(int fuelAmount) {
        if (fuelAmount > tankVolume) {
            System.out.println(fuelAmount - fuelConsumption);
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
