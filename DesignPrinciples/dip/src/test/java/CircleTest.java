import Circle.IMPL.AreaOfCircle;
import Circle.IMPL.CircumferenceOfCircle;
import Circle.IMPL.Circle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CircleTest {
    private Circle circle;
    AreaOfCircle circleArea;
    CircumferenceOfCircle circleCircumference;

    @Before
    public void setUp() throws Exception {
        circle = new Circle();

        circle.setArea(circleArea);
        circle.setCircumfrence(circleCircumference);

        circle.setRadius(2);
    }

    @Test
    public void AreaTest() throws Exception {
        Assert.assertEquals(12,circle.area());

    }

    @Test
    public void circumferenceTest() throws Exception {
        Assert.assertEquals(13,circle.circumference());
    }
}
