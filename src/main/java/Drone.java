/**
 * Created by Domenico on 16/02/2018.
 */
public class Drone extends GridObject{
    int id;
    int maxPayload;

    public Drone(int x, int y, int id, int maxPayload){
        super.coordinate = new Coordinate(x,y);
        this.id = id;
        this.maxPayload = maxPayload;
    }

    public int getId() {
        return id;
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "id=" + id +
                ", maxPayload=" + maxPayload +
                '}';
    }
}
