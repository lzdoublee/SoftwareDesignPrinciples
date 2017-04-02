package Cylinder;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class DisplayCylinder extends CalcCylinder {

    CalcCylinder calcCylinder;

    public DisplayCylinder(CalcCylinder calculation)
    {
        this.calcCylinder = calculation;
    }

    @Override
    public void printSurfaceArea() {
        System.out.println("Surface Area: " + surfaceArea());
    }

    @Override
    public void printVolume() {
        System.out.println("Volume: " + volume());
    }

}
