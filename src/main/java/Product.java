/**
 * Created by Domenico on 16/02/2018.
 */
public class Product extends GridObject {

    protected int typeId;
    protected double weight;

    public Product(int x, int y, int typeId, double weight) {
        super.coordinate = new Coordinate(x, y);
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
