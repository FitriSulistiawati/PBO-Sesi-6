package bangun_datar;

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
    }

    @Override
    public double hitungLuas() {
        return (Math.sqrt(3) / 4) * sisiA * sisiA; 
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisiA;
    }
}