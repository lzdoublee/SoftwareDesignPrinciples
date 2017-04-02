package ISPCylinder.IMPL;

import ISPCylinder.Cylinder;
import ISPCylinder.CylinderSurfaceArea;
import ISPCylinder.CylinderVolume;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CalcCylinder implements CylinderVolume, Cylinder, CylinderSurfaceArea {

    int radius;
    int height;
    public void setRadius(int rad)
    {
        this.radius = rad;
    }

    public void setHeight(int h) {
        this.height = h;
    }
    public int getRadius()
    {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public int volume()
    {
        return ((22/7)*(getRadius()*getRadius())*getHeight());
    }

    public int surfaceArea()
    {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }

}
