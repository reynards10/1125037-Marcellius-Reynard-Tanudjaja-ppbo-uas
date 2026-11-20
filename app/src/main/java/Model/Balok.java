package Model;

public class Balok extends Object3D{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang,double lebar,double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang (){
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public double getTinggi() {
        return tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar (double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi (double tinggi) {
        this.tinggi= tinggi;
    }
    
    @Override 
    public  double hitungLuasPermukaan(){
        return panjang * lebar * tinggi;
    }
    @Override 
    public  double hitungVolume(){
        return panjang * lebar;
    }
    @Override 
    public String getValueKeyDetails() {
        return "[Segi Empat , "+hitungLuasPermukaan();
    }


}
