import java.util.HashMap;

/**
 * Created by Domenico on 16/02/2018.
 */
public class Warehouse extends GridObject{
    private int id;
    private HashMap<Integer, Integer> stocks;

    public Warehouse(int x, int y, int id, HashMap<Integer, Integer> stocks) {
        super.coordinate = new Coordinate(x,y);
        this.id = id;
        this.stocks = stocks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStocks(HashMap<Integer, Integer> stocks) {
        this.stocks = stocks;
    }

    public int getId() {

        return id;
    }

    public HashMap<Integer, Integer> getStocks() {
        return stocks;
    }

    public void increment(int productId, int num){
        if(this.stocks.containsKey(productId)){
            this.stocks.put(productId, num);
        }else {
            int value = this.stocks.get(productId);
            this.stocks.remove(productId);
            this.stocks.put(productId, value + num);
        }
    }

    public void decrement(int productId, int num){
        if(!this.stocks.containsKey(productId)){
            throw new NotProductInWarehouse("The product " + productId + " is not presented in this warehouse");
        }

        int value = this.stocks.get(productId);
        if(num > value){
            throw new ToHighRequestError("Decrement not done. #product to decrement < of #num product available.");
        }else{
            this.stocks.remove(productId);
            this.stocks.put(productId, value - num);
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
