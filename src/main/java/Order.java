import java.util.HashMap;

/**
 * Created by Domenico on 16/02/2018.
 */
public class Order extends GridObject{
    protected int id;
    protected HashMap<Product, Integer> products;

    public Order(int id, HashMap<Product, Integer> products) {
        this.id = id;
        this.products = products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public boolean isDone(){
        boolean done = false;
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
                '}';
    }
}