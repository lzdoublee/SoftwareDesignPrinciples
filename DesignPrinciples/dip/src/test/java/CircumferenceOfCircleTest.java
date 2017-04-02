import Circle.IMPL.CircumferenceOfCircle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class CircumferenceOfCircleTest {
    private CircumferenceOfCircle circumference;

    @Before
    public void setUp() throws Exception {
        circumference = new CircumferenceOfCircle(circumference);
        circumference.setRadius(2);
    }

    @Test
    public void circumferenceTest() throws Exception {
        Assert.assertEquals(12,circumference.circumference());
    }
}
