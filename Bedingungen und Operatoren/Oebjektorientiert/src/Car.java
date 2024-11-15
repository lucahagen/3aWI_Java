public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;
    public int tankVolume;

    public Car(int fuelConsumption, String brand, String serialNumber, String color, int tankVolume){
        this.fuelConsumption = fuelConsumption;
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

    public int getRemainingRange() {
        return fuelAmount  / fuelConsumption;
    }
}
