import RactangularPrism.IMPL.PrismCalculations;
import RactangularPrism.IMPL.RectangularPrism;
import RactangularPrism.IPrismCalculations;
import RactangularPrism.IRectangularPrism;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class PrismCalculatorTest {

    IPrismCalculations iPrismCalculations;
    IRectangularPrism iRectangularPrism;
    @Before
    public void setUp() throws Exception {
        iPrismCalculations = new PrismCalculations();
        iRectangularPrism = new RectangularPrism();
        iRectangularPrism.setWidth(2);
        iRectangularPrism.setLength(2);
        iRectangularPrism.setHeight(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(24,iPrismCalculations.surfaceArea(iRectangularPrism));
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(8,iPrismCalculations.volume(iRectangularPrism));
    }

}
