public class Komplex {
    double a = 0;
    double b = 0;


    public Komplex(double re, double im) {
        this.a = re;
        this.b = im;
    }

    public Komplex add(Komplex add) {
        Komplex result = new Komplex(0,0);
        result.a = a + add.a;
        result.b = b + add.b;
        return result;
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
