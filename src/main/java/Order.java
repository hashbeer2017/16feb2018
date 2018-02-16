import java.util.HashMap;

/**
 * Created by Domenico on 16/02/2018.
 */
public class Order extends GridObject{
    private int id;
    private HashMap<Integer, Integer> products;

    public Order(int x, int y, int id, HashMap<Integer, Integer> products) {
        super.coordinate = new Coordinate(x,y);
        this.id = id;
        this.products = products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProducts(HashMap<Integer, Integer> products) {
        this.products = products;
    }

    public HashMap<Integer, Integer> getProducts() {
        return products;
    }

    public boolean isDone(){
        for(int val : this.products.values()){
            if(val > 0)
                return false;
            else
                continue;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                "} " + super.toString();
    }
}
