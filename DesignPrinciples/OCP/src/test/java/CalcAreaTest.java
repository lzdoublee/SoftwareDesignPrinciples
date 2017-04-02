import Shapes.CalcArea;
import Shapes.Circle;
import Shapes.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CalcAreaTest {

    private CalcArea acArea;
    private Circle circle;
    private Rectangle rec;

    @Before
    public void setUp() throws Exception {
        acArea = new CalcArea();
        circle = new Circle();
        rec = new Rectangle();
        circle.setRadius(2);
        rec.setBreadth(2);
        rec.setLength(3);
    }

    @Test
    public void testCircleArea() throws Exception {
        Assert.assertEquals(12,acArea.area(circle));

    }

    @Test
    public void testRectangleArea() throws Exception {
        Assert.assertEquals(6,acArea.area(rec));
    }
}
