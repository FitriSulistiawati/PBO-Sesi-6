package bangun_datar;

public abstract class Segitiga implements Shape {
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
}
