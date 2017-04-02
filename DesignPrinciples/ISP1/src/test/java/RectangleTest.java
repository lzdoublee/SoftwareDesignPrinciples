import Cube.CubeAreaIMPL.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class RectangleTest {

    private Rectangle rec;

    @Before
    public void setUp() throws Exception {
        rec = new Rectangle();
        rec.setBreadth(2);
        rec.setLength(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(4,rec.area());

    }
}
