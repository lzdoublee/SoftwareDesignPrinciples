import ISPCylinder.IMPL.IMPLOfSurfaceArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class SurfaceAreaTest {

    IMPLOfSurfaceArea sArea;

    @Before
    public void setUp() throws Exception {
        sArea = new IMPLOfSurfaceArea();
        sArea.setRadius(2);
        sArea.setHeight(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(48, sArea.surfaceArea());
    }

}
