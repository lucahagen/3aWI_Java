public class RearMirror {
    private int size;     // Größe des Rückspiegels
    private int position; // Position des Rückspiegels (z. B. 1 = links, 2 = rechts, 3 = Mitte)

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}


