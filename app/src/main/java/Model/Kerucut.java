package Model;

public class Kerucut extends Object3D {
    private double tinggi;
    private double jariJari;

    public Kerucut (double tinggi, double jariJari) {
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }
    public double getJariJari() {
        return jariJari;
    }

    public void setTinggi (double tinggi) {
        this.tinggi=tinggi;
    }
    public void setJarijari(double jariJari){
        this.jariJari=jariJari;
    }

    @Override 
    public  double hitungLuasPermukaan(){
        return 3.14 * (tinggi + jariJari);
    }
    @Override 
    public  double hitungVolume(){
        return ((1/3) * 3.14) * (jariJari * jariJari) * tinggi;
    }
    @Override 
    public String getValueKeyDetails() {
        return "[Segi Empat , "+hitungLuasPermukaan();
    }
}
