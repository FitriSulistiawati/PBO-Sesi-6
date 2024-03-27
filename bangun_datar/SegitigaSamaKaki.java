package bangun_datar;

public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * sisiA * sisiC;
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
