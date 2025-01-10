public class Kreis extends Figur {
        protected double radius = 50.0;
        public Kreis(double x, double y, double rad) {
            super(x, y);
            if (rad >= 0)
                radius = rad;
        }
        public Kreis() {}
    }

