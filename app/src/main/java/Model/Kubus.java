package Model;

public class Kubus extends Object3D{
    private double sisi;

    public Kubus(double sisi) {
        this.sisi=sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi=sisi;
    }

    @Override 
    public  double hitungLuasPermukaan(){
        return sisi * sisi * sisi;
    }
    @Override 
    public  double hitungVolume(){
        return 6 * (sisi * sisi * sisi);
    }
    @Override 
    public String getValueKeyDetails() {
        return "[Segi Empat , "+hitungLuasPermukaan();
    }
}
