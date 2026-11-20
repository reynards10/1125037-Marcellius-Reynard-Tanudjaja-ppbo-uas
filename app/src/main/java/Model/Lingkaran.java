package Model;

public class Lingkaran extends Object2D{
    private double jarijari;

    public Lingkaran (double jarijari) {
        this.jarijari=jarijari;
    }

    public double getJariJari() {
        return jarijari;
    }

    public void setJarijari(double jarijari){
        this.jarijari=jarijari;
    }

    @Override 
    public double hitungLuas() {
        return jarijari * 3.14 ;
    }
   @Override 
    public double hitungKeliling() {
        return jarijari *3.14 ;
    }

    @Override
    public String getValueKeyDetails() {
        return "[Persegi , "+hitungLuas();
    }
}
