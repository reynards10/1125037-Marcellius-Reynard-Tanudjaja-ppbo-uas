package Model;

public class SegiEmpat extends Object2D {
    private double panjang;
    private double lebar;

    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar=lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    @Override
    public double hitungKeliling() {
        return (2*panjang) + (2*lebar);
    }
    @Override 
    public String getValueKeyDetails() {
        return "[Segi Empat , "+hitungLuas();
    }
}
