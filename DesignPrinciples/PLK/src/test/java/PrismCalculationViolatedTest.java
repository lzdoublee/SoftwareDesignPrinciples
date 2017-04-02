import RectangularPrismViolated.IMPL.PrismCalculationViolated;
import RectangularPrismViolated.IMPL.RectangularPrismViolated;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class PrismCalculationViolatedTest {

    PrismCalculationViolated pCViolated;
    RectangularPrismViolated rectangularPrismViolated;
    @Before
    public void setUp() throws Exception {
        pCViolated = new PrismCalculationViolated();
        rectangularPrismViolated = new RectangularPrismViolated();

        rectangularPrismViolated.setHeight(2);
        rectangularPrismViolated.setLength(2);
        rectangularPrismViolated.setWidth(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(12,pCViolated.surfaceArea(rectangularPrismViolated));

    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(12,pCViolated.volume(rectangularPrismViolated));

    }

}
