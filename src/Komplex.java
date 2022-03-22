public class Komplex {
    double a = 0;
    double b = 0;


    public Komplex(double re, double im) {

        this.a = re;
        this.b = im;
    }

    public Komplex add(Komplex add) {
        add.a = a + add.a;
        add.b = b + add.b;
        return add;
    }

    public Komplex multiply(Komplex b) {
        return b;
    }

    @Override
    public String toString() {
        return "Komplex{" + a + " " + "+" + " " + b + "i" + "}";
    }

    public double arg() {
        return a + b;
    }
}
