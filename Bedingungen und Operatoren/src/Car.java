import org.w3c.dom.ls.LSOutput;

public class Car extends Vehicle {
private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("The " + getBrand() + " is honking.");
    }

}

//Create a subclass called Car that extends Vehicle and includes:
//An additional int field named numberOfDoors.
//A method honk() that prints: "The <brand> car is honking!"
//A constructor that initializes both the brand and numberOfDoors.
//In the main() method of your program:
//Create an instance of Car.
//Call startEngine() and honk() methods on the Car instance.
//Print the number of doors of the car.