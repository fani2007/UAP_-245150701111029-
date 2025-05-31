package uap.bases;

public abstract class Bentuk {
    protected static final double PI = 22.0 / 7;
    protected static final double MASSA_JENIS = 8; 

    public abstract double getVolume();
    public abstract double getLuasPermukaan();

    public double getMassa() {
        return getVolume() * MASSA_JENIS;
    }

    public void printInfo() {
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas permukaan : " + getLuasPermukaan());
        System.out.println("Massa : " + getMassa());
    }
}
