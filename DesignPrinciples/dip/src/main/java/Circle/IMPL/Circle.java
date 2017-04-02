package Circle.IMPL;
import Circle.IArea;
import Circle.ICircumference;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class Circle implements IArea, ICircumference{
    IArea area;
    AreaOfCircle circleArea = new AreaOfCircle(area);
    ICircumference circumference;
    CircumferenceOfCircle circleCircumference = new CircumferenceOfCircle(circumference);
    private int radius;


    public void setArea(IArea area)
    {
        this.area = area;
    }

    public void setCircumfrence(ICircumference circumfrence)
    {
        this.circumference = circumfrence;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        circleCircumference.setRadius(radius);

    }

    public int area() {
        return circleArea.area();
    }

    public int circumference() {
        return circleCircumference.circumference();
    }
}
