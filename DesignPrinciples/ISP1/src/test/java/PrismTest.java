import Cube.CubeAreaIMPL.Prism;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class PrismTest {

    private Prism prism;

    @Before
    public void setUp() throws Exception {
        prism = new Prism();
        prism.setLength(2);
        prism.setBreadth(2);
        prism.setHeight(2);
    }

    @Test
    public void testArea() throws Exception
    {
        Assert.assertEquals(24,prism.area());
    }
}
