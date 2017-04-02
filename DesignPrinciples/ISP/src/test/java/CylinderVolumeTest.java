import ISPCylinder.IMPL.IMPLOfVolume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CylinderVolumeTest {

    IMPLOfVolume volume;

    @Before
    public void setUp() throws Exception
    {
        volume = new IMPLOfVolume();
        volume.setHeight(2);
        volume.setRadius(2);
    }

    @Test
    public void testVolume() throws Exception
    {
        Assert.assertEquals(24, volume.volume());
    }
}
