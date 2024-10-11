import java.util.Random;

public class Zufallszahlen {
    public static void main(String[] args) {
        Random random = new Random();
        int summe = 0;

        while (true) {
            // Zufallszahl zwischen 10 und 30 generieren
            int zahl = random.nextInt(21) + 10; // Generiert eine Zahl zwischen 10 und 30
            System.out.println("Generierte Zahl: " + zahl);

            // Prüfen, ob die Zahl 15 oder 25 ist
            if (zahl == 15 || zahl == 25) {
                break;
            }

            // Zur Summe hinzufügen
            summe += zahl;
        }

        // Ausgabe der Summe
        System.out.println("Summe der vorherigen Zufallszahlen: " + summe);
    }
}
