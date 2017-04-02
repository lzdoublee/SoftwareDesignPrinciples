import ISPCylinder.IMPL.CalcCylinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CylinderCalculationTest {

    private CalcCylinder calcCylinder;

    @Before
    public void setUp() throws Exception {
        calcCylinder = new CalcCylinder();
        calcCylinder.setRadius(2);
        calcCylinder.setHeight(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(48,calcCylinder.surfaceArea());
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(24,calcCylinder.volume());
    }

}
