package Shapes.CalcCircle;

import Shapes.CircleApp.CircleApp;
import Shapes.CircleApp.CircleRadiusSet;
import Shapes.CircleInfo.CircleInfo;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CircleApplication extends CircleInfo {
    CircleApp cApp;
    CircleRadiusSet circleRadiusSet;
    public CircleApplication(CircleApp circleApp,CircleRadiusSet cRadSet)
    {
        this.cApp = circleApp;
        this.circleRadiusSet = cRadSet;
    }

    public int area()
    {
        return cApp.area();
    }

    public int circumference()
    {
        return cApp.circumference();
    }

}
