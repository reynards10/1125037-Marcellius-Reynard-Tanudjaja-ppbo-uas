package Model;

public abstract class Object2D extends GObject {

    public Object2D(String label) {
        super(label);
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}
