package ShapesViolated.CircleInfoViolated;

import ShapesViolated.CircleAppViolated.CircleRadiusSetViolated;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CircleInfoViolated implements CircleRadiusSetViolated {

    int radius;

    public void setRadius(int rad) {
        this.radius = rad;
    }

    public int getRadius() {
        return this.radius;
    }
}
