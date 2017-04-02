import Cylinder.CalcCylinder;
import Cylinder.DisplayCylinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CalcCylinderTest {
    private CalcCylinder calcCylinder;

    @Before
    public void setUp() throws Exception {
        calcCylinder = new DisplayCylinder(calcCylinder);
        calcCylinder.setRadius(2);
        calcCylinder.setHeight(3);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(60, calcCylinder.surfaceArea());
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(36,calcCylinder.volume());
    }
}