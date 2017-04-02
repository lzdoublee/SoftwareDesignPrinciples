package ShapesViolated;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CalcAreaViolated {
    public int area(Object obj)
    {
        RectangleViolated rectangleViolate = new RectangleViolated();

        int area =0;

        if(rectangleViolate.equals(obj))
        {

            area = rectangleViolate.getBreadth()* rectangleViolate.getLength();
        }else
        {
            CircleViolated circleViolate = new CircleViolated();
            area = circleViolate.getRadius() * circleViolate.getRadius() * (22/7);
        }

        return area;
    }

}
