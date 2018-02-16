import java.util.HashMap;

/**
 * Created by Domenico on 16/02/2018.
 */
public class Warehouse extends GridObject{
    private int id;
    private HashMap<Product, Integer> stocks;

    public Warehouse(int x, int y, int id, HashMap<Product, Integer> stocks) {
        super.coordinate = new Coordinate(x,y);
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
        if(this.stocks.containsKey(p)){
            this.stocks.put(p, num);
        }else {
            int value = this.stocks.get(p);
            this.stocks.remove(p);
            this.stocks.put(p, value + num);
        }
    }

    public void decrement(Product p, int num){
        if(!this.stocks.containsKey(p)){
            throw new NotProductInWarehouse("The product " + p + " is not presented in this warehouse");
        }

        int value = this.stocks.get(p);
        if(num > value){
            throw new ToHighRequestError("Decrement not done. #product to decrement < of #num product available.");
        }else{
            this.stocks.remove(p);
            this.stocks.put(p, value - num);
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", stocks=" + stocks +
                "} " + super.toString();
    }
}
