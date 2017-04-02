package ISPCylinder.IMPL;

import ISPCylinder.Cylinder;
import ISPCylinder.CylinderSurfaceArea;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class IMPLOfSurfaceArea implements CylinderSurfaceArea, Cylinder {

    int radius;
    int height;
    public int surfaceArea()
    {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }

    public void setRadius(int r)
    {
        this.radius = r;
    }

    public void setHeight(int h)
    {
        this.height = h;
    }
    public int getRadius()
    {
        return radius;
    }

    public int getHeight()
    {
        return height;
    }
}
