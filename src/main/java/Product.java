/**
 * Created by Domenico on 16/02/2018.
 */
public class Product{
    private int typeId;
    private int weight;

    public Product(int typeId, int weight) {
        this.typeId = typeId;
        this.weight = weight;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "typeId=" + typeId +
                ", weight=" + weight +
                '}';
    }
}
