package Shapes.CalcCircle;

import Shapes.CircleApp.CircleApp;
import Shapes.CircleApp.CircleRadiusSet;
import Shapes.CircleInfo.CircleInfo;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CircleCirculation extends CircleInfo implements CircleApp,CircleRadiusSet {

    CircleRadiusSet circleRaduisSet;

    public CircleCirculation(CircleRadiusSet cRadSet) {
        this.circleRaduisSet = cRadSet;
    }

    public int area()
    {
        return (22/7) * (circleRaduisSet.getRadius() * circleRaduisSet.getRadius());
    }

    public int circumference()
    {
        return 2 * (22/7) * circleRaduisSet.getRadius();
    }
}
