package bangun_ruang;

public class Bola implements Geometri {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }
}
