package at.ran.basics;



import java.util.Random;



public class ControlStructurs4 {

    public static void main(String[] args) {

// Erstelle zwei Zufallszahl zwischen 0 und 100 
Random random = new Random();
int randomNumber = random.nextInt( bound: 100);

Random2 random = new Random2();
int RandomNumber2 = random2.nextInt( bound: 100);
// Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50 
if((randomNumber<RandomNumber2) && (randomNumber<50)) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

else
        System.out.println(Verloren);
// dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini" 
        if((randomNumber<30) || (randomNumber2<30)) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

else
        System.out.println(Verloren2);


// Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30 

// dann gib aus "Eine der beiden ist kleiner als 30 ist"



// Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist 
        if((randomNumber<t0) && (randomNumber2!=50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }

else
        System.out.println(Verloren2);


// dann gib aus "Erste Zahl klein, zweite kein 50iger" 







    }

} 

 