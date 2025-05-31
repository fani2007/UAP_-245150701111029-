package uap.models;

import uap.bases.Bentuk;
import uap.interfaces.KonversiMassa;
import uap.interfaces.HitungBiaya;

public class Sphere extends Bentuk implements KonversiMassa, HitungBiaya {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * PI * r * r * r;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * r * r;
    }

    @Override
    public int konversiKg(double massaGram) {
        return (int) Math.ceil(massaGram / 1000);
    }

    @Override
    public int hitungBiayaKirim(int massaKg) {
        return massaKg * 10000;
    }
}
