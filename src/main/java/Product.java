/**
 * Created by Domenico on 16/02/2018.
 */
public class Product {

    protected int typeId;
    protected double weight;

    public Product(int typeId, double weight) {
        this.typeId = typeId;
        this.weight = weight;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

}
