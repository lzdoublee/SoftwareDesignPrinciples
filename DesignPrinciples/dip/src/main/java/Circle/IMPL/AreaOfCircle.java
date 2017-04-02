package Circle.IMPL;
import Circle.IArea;
/**
 * Created by L.z Double E on 4/2/2017.
 */
public class AreaOfCircle implements IArea{
    IArea area;
    private int radius;
    public AreaOfCircle(IArea area)
    {
        this.area = area;
    }

    public int area()
    {
        return (22/7)*(getRadius()*getRadius());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }
}