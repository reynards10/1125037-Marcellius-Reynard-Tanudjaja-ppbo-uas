package Model;

public class Persegi extends Object2D {
    private double sisi;

    public Persegi(double sisi) {
        super(this);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi() {
        this.sisi = sisi;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    public abstract String getValueKeyDetails();
}
