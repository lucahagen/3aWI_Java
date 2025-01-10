public class FigurenDemo {
    public static void main(String[] args) {
        Figur fig = new Figur(50.0, 50.0);
        System.out.println("Figur erstellt: " + fig);
        Kreis krs = new Kreis(10.0, 10.0, 5.0);
        System.out.println("Kreis erstellt: " + krs);
    }
}
