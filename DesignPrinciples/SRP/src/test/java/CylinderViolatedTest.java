
import org.junit.Assert;
import org.junit.Before;
import CylinderViolated.CylinderViolated;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CylinderViolatedTest {

    private CylinderViolated violatedCylinder;

    @Before
    public void setUp() throws Exception {
        violatedCylinder = new CylinderViolated();
        violatedCylinder.setHeight(3);
        violatedCylinder.setRadius(2);
    }

    @Test
    public void SurfaceAreaTest() throws Exception {
        Assert.assertEquals(60,violatedCylinder.surfaceArea());
    }

    @Test
    public void volumeTest() throws Exception {
        Assert.assertEquals(36,violatedCylinder.volume());
    }

    @Test
    public void displaySurfaceAreaTest() throws Exception {
        violatedCylinder.printSurfaceArea();
    }

    @Test
    public void displayVolumeTest() throws Exception {
        violatedCylinder.printVolume();

    }
}
