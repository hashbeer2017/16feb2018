import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    private Map<Integer, Order> orders = new HashMap<Integer, Order>();

    public OrderManager(List<Order> orders) {
        for(Order o: orders) {
            this.orders.put(o.getId(), o);
        }
    }

    public Order getOrder(int orderID){
        return this.orders.get(orderID);
    }

    public Coordinate getCustomerCoordianate(int orderID) {
        return this.getOrder(orderID).getCoordinate();
    }
}
