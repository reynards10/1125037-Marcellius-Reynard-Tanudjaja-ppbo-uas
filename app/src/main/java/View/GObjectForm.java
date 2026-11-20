package Controller;

import Model.GObject;

public class GObjectForm<T extends GObject> {

    public T showInsertForm() {
        String [] label = this.getFields();
        T record = this.records.get(i);
            double [] values = this.constructModelToValues(record);
        for (int i = 0; i < fields.length; i++){
            System.out.print(fields[i]+ " ");
        }
    }

    protected abstract String[]getFields();

    protected abstract T constructModelFromValues(String label, double[] values);

    protected abstract double[]extractValuesFromModel(T model);

}
