import java.util.Random;

public class Switch {

    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(11 - 6 + (11));


        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;

            case 9:
                System.out.println("Nine");
                break;

            case 8:
                System.out.println("Eight");
                break;
        }
    }
}