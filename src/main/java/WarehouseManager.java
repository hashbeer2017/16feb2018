import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarehouseManager {
    private Map<Integer, Warehouse> map = new HashMap<Integer, Warehouse>();

    public WarehouseManager(List<Warehouse> warehouses) {
        for(Warehouse w : warehouses) {
            this.map.put(w.getId(), w);
        }
    }

    public Coordinate getWarehouseCoordainte(int warehouseID){
        return this.map.get(warehouseID).getCoordinate();
    }

}
