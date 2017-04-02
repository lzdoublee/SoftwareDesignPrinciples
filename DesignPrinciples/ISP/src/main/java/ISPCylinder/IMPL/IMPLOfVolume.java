package ISPCylinder.IMPL;

import ISPCylinder.Cylinder;
import ISPCylinder.CylinderVolume;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class IMPLOfVolume implements CylinderVolume, Cylinder {

    int radius;
    int height;
    public int volume()
    {
        return ((22/7)*(getRadius()*getRadius())*getHeight());
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
