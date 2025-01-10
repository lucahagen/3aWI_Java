// Hauptprogramm zur Demonstration
public class Main {
    public static void main(String[] args) {

        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(100);

        RemoteControl remote = new RemoteControl(battery1, battery2);

        remote.turnOn();
        System.out.println(remote.getStatus() + "%");


        remote.turnOff();
        System.out.println(remote.getStatus() + "%");
    }
}