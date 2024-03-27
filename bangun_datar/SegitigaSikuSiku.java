package bangun_datar;

public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi, Math.sqrt(alas * alas + tinggi * tinggi));
    }

    @Override
    public double hitungLuas() {
        return 0.5 * sisiA * sisiB;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
