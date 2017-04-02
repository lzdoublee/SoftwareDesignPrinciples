import PowerViolated.LightBulb.LightBulb;
import PowerViolated.PowerSwitch.PowerSwitch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class LightBulbTest {
    private PowerSwitch pSwitch;
    private LightBulb lightBulb;
    @Before
    public void setUp() throws Exception {
        lightBulb = new LightBulb();
        pSwitch = new PowerSwitch(lightBulb);

    }

    @Test
    public void testIsOn() throws Exception {
        Assert.assertEquals(true,pSwitch.isOn());
    }
}