package uap.models;

import uap.bases.Bentuk;
import uap.interfaces.KonversiMassa;
import uap.interfaces.HitungBiaya;

public class Torus extends Bentuk implements KonversiMassa, HitungBiaya {
    private double R, r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * R * r * r;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * PI * R * r;
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
