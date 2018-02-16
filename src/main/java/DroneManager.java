import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Domenico on 16/02/2018.
 */
public class DroneManager {
    private List<Drone> drones;
    private HashMap<Integer, Drone> dronesIndex;

    public DroneManager(List<Drone> drones) {
        this.drones = drones;
        this.dronesIndex = new HashMap<Integer, Drone>();

        //Create index for drones
        for(Drone d : this.drones){
            dronesIndex.put(d.getId(), d);
        }
    }

    public HashMap<Integer, Drone> getDronesIndex() {
        return dronesIndex;
    }

    public void setDrones(List<Drone> drones) {
        this.drones = drones;
        //Create index for drones
        for(Drone d : this.drones){
            dronesIndex.put(d.getId(), d);
        }
    }
}
