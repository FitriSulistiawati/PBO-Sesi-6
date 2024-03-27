package bangun_datar;

public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double sisiA, double sisiB, double sisiC) {
        super(sisiA, sisiB, sisiC);
    }

    @Override
    public double hitungLuas() {
        // Menggunakan rumus Heron untuk menghitung luas segitiga sembarang
        double semiPerimeter = (sisiA + sisiB + sisiC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sisiA) * (semiPerimeter - sisiB) * (semiPerimeter - sisiC));
    }

    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
