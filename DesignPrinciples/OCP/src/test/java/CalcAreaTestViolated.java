import ShapesViolated.CalcAreaViolated;
import ShapesViolated.CircleViolated;
import ShapesViolated.RectangleViolated;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CalcAreaTestViolated {

    private CircleViolated cViolated;
    private RectangleViolated recViolate;
    private CalcAreaViolated acViolated;

    @Before
    public void setUp() throws Exception {
        cViolated = new CircleViolated();
        recViolate = new RectangleViolated();
        acViolated = new CalcAreaViolated();
        cViolated.setRadius(2);
        recViolate.setBreadth(2);
        recViolate.setLength(2);
    }

    @Test
    public void testCircleArea() throws Exception
    {

    }

    @Test
    public void testRectangleArea() throws Exception {
        Assert.assertEquals(13,acViolated.area(recViolate));

    }
}
