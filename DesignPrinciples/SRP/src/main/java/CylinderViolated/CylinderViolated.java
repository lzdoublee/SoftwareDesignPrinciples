package CylinderViolated;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CylinderViolated {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int rad) {
        this.radius = rad;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    //Responsibility: Cylinder Calculations
    public int surfaceArea()
    {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }
    public int volume()
    {
        return ((22/7)*(getRadius()*getRadius())*getHeight());
    }

    //Responsibility: Print out the values
    public void printSurfaceArea()
    {
        System.out.println("Surface Area: " + surfaceArea());
    }
    public void printVolume()
    {
        System.out.println("Volume: " + volume());
    }
}
