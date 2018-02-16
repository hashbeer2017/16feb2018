import java.util.HashMap;

/**
 * Created by Domenico on 16/02/2018.
 */
public class Warehouse extends GridObject{
    protected int id;
    protected HashMap<Product, Integer> stocks;

    public Warehouse(int x, int y, int id, HashMap<Product, Integer> stocks) {
        this.id = id;
        this.stocks = stocks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStocks(HashMap<Product, Integer> stocks) {
        this.stocks = stocks;
    }

    public int getId() {

        return id;
    }

    public HashMap<Product, Integer> getStocks() {
        return stocks;
    }

    public void increment(Product p, int num){
        int value = this.stocks.get(p);
        this.stocks.remove(p);
        this.stocks.put(p, value + num);
    }

    public void decrement(Product p, int num){
        int value = this.stocks.get(p);
        if(num > value){
            throw new ToHighRequestError("Decrement not done. #product to decrement < of #num product available.");
        }else{
            this.stocks.remove(p);
            this.stocks.put(p, value - num);
        }
    }
}
