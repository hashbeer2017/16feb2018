/**
 * Created by Domenico on 16/02/2018.
 */
public abstract class GridObject {
    protected Coordinate coordinate;

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public void setCoordinate(int x, int y){
        this.coordinate = new Coordinate(x,y);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public int getX(){
        return this.coordinate.getX();
    }

    public int getY(){
        return this.coordinate.getY();
    }
}
