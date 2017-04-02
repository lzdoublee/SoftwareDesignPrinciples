package Shapes;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class Circle extends Shapes {
    private int radius;

    @Override
    public int area() {
        return  (getRadius() * getRadius()) * (22/7);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
