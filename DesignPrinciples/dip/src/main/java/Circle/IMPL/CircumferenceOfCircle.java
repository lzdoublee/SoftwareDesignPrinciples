package Circle.IMPL;

import Circle.ICircumference;
/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CircumferenceOfCircle implements ICircumference {

    private int radius;
    ICircumference circumference;

    public CircumferenceOfCircle(ICircumference c)
    {
        this.circumference = c;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int circumference() {
        return 2*(22/7)*getRadius();
    }

}
