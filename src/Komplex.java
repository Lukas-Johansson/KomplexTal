import java.util.Objects;

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

    public Komplex multiply(Komplex mult) {
        Komplex multresult = new Komplex(0, 0);
        multresult.a = a * mult.a - b * mult.b;
        multresult.b = mult.a * b + a * mult.b;
        return multresult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.a, a) == 0 && Double.compare(komplex.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Komplex{" + a + " " + "+" + " " + b + "i" + "}";
    }

    public double arg() {
        double potatis = Math.atan(b/a);
        return potatis;
    }
}
