import Circle.IMPL.AreaOfCircle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CircleOfAreaTest {
    private AreaOfCircle cArea;


    @Before
    public void setUp() throws Exception {
        cArea = new AreaOfCircle(cArea);
        cArea.setRadius(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(12,cArea.area());

    }
}
