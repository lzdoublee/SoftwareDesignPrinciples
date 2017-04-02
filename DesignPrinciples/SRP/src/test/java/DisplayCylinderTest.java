import Cylinder.CalcCylinder;
import Cylinder.DisplayCylinder;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class DisplayCylinderTest {
    private CalcCylinder cylinder;

    @Before
    public void setUp() throws Exception {
        //printCylinder = new PrintCylinder(cylinderCalculation);
        cylinder = new DisplayCylinder(cylinder);
        cylinder.setHeight(3);
        cylinder.setRadius(2);
    }

    @Test
    public void printSurfaceAreaTest() throws Exception {
        cylinder.printSurfaceArea();
    }

    @Test
    public void printVolumeTest() throws Exception {
        cylinder.printVolume();
    }
}
