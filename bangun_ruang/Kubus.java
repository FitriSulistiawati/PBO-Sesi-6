package bangun_ruang;
import bangun_datar.Persegi;

public class Kubus implements Geometri {
    private double sisi;

    private Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        Persegi persegi = new Persegi(sisi);
        return persegi.hitungLuas() * 6;
    }
}
