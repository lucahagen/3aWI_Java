public class Main {


    public static void main(String[] args) {
        Car myCar = new Car("WV", 8);
        myCar.startEngine();
        myCar.honk();
        System.out.println("Number of doors: " + myCar.getNumberOfDoors());
    }
}

//In the main() method of your program:
//Create an instance of Car.
//Call startEngine() and honk() methods on the Car instance.
//Print the number of doors of the car.