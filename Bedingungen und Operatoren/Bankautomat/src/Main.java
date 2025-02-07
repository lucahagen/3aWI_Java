import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            // Menü anzeigen
            System.out.println("Willkommen beim Bankomaten!");
            System.out.println("Bitte wählen Sie eine Option:");
            System.out.println("1: Einzahlen");
            System.out.println("2: Abheben");
            System.out.println("3: Kontostand anzeigen");
            System.out.println("4: Beenden");

            // Benutzereingabe 
            int selection = scanner.nextInt();

            // Option 1: Einzahlen
            if (selection == 1) {
                System.out.println("Wie viel Geld wollen Sie einzahlen?");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println(deposit + " Euro erfolgreich eingezahlt.");
                } else {
                    System.out.println("Ungültiger Betrag.");
                }
            }

            // Option 2: Abheben
            if (selection == 2) {

                System.out.println("Wie viel Geld wollen Sie abheben?");
                double withdraw = scanner.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println(withdraw + " Euro erfolgreich abgehoben.");
                } else {
                    System.out.println("Ungültiger Betrag oder nicht genügend Guthaben.");
                }
            }

            // Option 3: Kontostand anzeigen
            if (selection == 3) {
                System.out.println("Der Kontostand beträgt " + balance + " Euro.");
            }

            // Option 4: Beenden
            if (selection == 4) {
                System.out.println("Vielen Dank für die Nutzung des Bankomaten. Auf Wiedersehen!");
                scanner.close(); // Scanner schließen
                break; // Schleife beenden
            }

            // Falls eine ungültige Auswahl getroffen wird
            if (selection < 1 || selection > 4) {
                System.out.println("Ungültige Auswahl. Bitte wählen Sie eine Option zwischen 1 und 4.");
            }
        }
    }
}

