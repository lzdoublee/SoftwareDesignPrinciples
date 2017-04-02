import ViolatedCube.ViolatedPrism;
import ViolatedCube.ViolatedRectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class ViolatedPrismTest {

    private ViolatedPrism violatedPrism;
    private ViolatedRectangle violatedRec;

    @Before
    public void setUp() throws Exception {
        violatedPrism = new ViolatedPrism();
        violatedRec = new ViolatedPrism();
        violatedPrism.setLength(2);
        violatedPrism.setLength(2);
        violatedPrism.setHeight(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(8,violatedPrism.area());

    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(8,violatedRec.area());

    }
}
