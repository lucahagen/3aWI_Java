public class Battery {
    private int chargeLevel;

    public Battery(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }


    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void reduceCharge(int amount) {
        this.chargeLevel = Math.max(0, this.chargeLevel - amount);
    }
    public void connectConsumer() {
        System.out.println("Verbraucher angeschlossen");
    }

    public void disconnectConsumer() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}