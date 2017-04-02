import Shapes.CalcCircle.CircleApplication;
import Shapes.CalcCircle.CircleCirculation;
import Shapes.CircleApp.CircleApp;
import Shapes.CircleApp.CircleRadiusSet;
import Shapes.CircleInfo.CircleInfo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class CircleAppTest {

    CircleApp circleApp;
    CircleRadiusSet cRadSet;
    CircleApplication circleApplication;
    @Before
    public void setUp() throws Exception {
        cRadSet = new CircleInfo();
        circleApp = new CircleCirculation(cRadSet);
        cRadSet.setRadius(2);

        circleApplication = new CircleApplication(circleApp,cRadSet);
    }

    @Test
    public void areaTest() throws Exception
    {
        Assert.assertEquals(12,circleApplication.area());

    }

    @Test
    public void circumferenceTest() throws Exception {
        Assert.assertEquals(12,circleApplication.circumference());
    }
}