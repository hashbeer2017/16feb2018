import java.lang.Math;

public class Utility {

    public static int distance(GridObject o1, GridObject o2) {
        double doubleRes = Math.sqrt(
                Math.pow(Math.abs(o1.getX() - o2.getX()), 2) + Math.pow(Math.abs(o1.getY() - o2.getY()), 2)
        );

        return (int) doubleRes + 1;
    }

}
