package ISPCylinderViolated.CalcIMPL;

import ISPCylinder.Cylinder;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CylinderSurfaceArea implements Cylinder, ISPCylinder.CylinderSurfaceArea{
    int radius;
    int height;

    public void setRadius(int rad)
    {
        this.radius = rad;
    }

    public void setHeight(int h)
    {
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public int surfaceArea()
    {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }
}
