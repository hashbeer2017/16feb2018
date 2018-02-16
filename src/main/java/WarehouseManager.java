import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WarehouseManager {
    private Map<Integer, Warehouse> map = new HashMap<Integer, Warehouse>();
    private List<Warehouse> warehouses= new LinkedList<Warehouse>();

    public WarehouseManager(List<Warehouse> warehouses) {
        this.warehouses = warehouses;

        for(Warehouse w : warehouses) {
            this.map.put(w.getId(), w);
        }
    }

    public Coordinate getWarehouseCoordainte(int warehouseID){
        return this.map.get(warehouseID).getCoordinate();
    }

    public List<Warehouse> getWarehouses() {
        return this.warehouses;
    }

    public int getAvailability(int warehouseID, int productTypeID) {
        return this.map
                        .get(warehouseID)
                        .getStocks()
                        .get(productTypeID);
    }

}
