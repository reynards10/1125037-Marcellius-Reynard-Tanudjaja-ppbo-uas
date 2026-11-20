package Model;

public abstract class GObject {
    private String label;

    public GObject( String label ) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel() {
        this.label = label;
    }

    public abstract String getValueKeyDetails();
}
