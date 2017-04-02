package RectangularPrismViolated.IMPL;

import RactangularPrism.IMPL.RectangularPrism;

import RactangularPrism.IRectangularPrism;
import RectangularPrismViolated.IRectangularPrismViolated;
import RectangularPrismViolated.IPrismCalculationsViolated;
/**
 * Created by L.z Double E on 4/1/2017.
 */
public class PrismCalculationViolated implements IPrismCalculationsViolated{

    IRectangularPrism iRectangularPrism;

    public PrismCalculationViolated()
    {
        iRectangularPrism = new RectangularPrism();
    }
    public int surfaceArea(IRectangularPrismViolated iRectangularPrismViolated) {

        return 2*((iRectangularPrism.getWidth()*iRectangularPrism.getLength())+(iRectangularPrism.getHeight()*iRectangularPrism.getLength())+(iRectangularPrism.getHeight()*iRectangularPrism.getWidth()));
    }

    public int volume(IRectangularPrismViolated iRectangularPrismViolate) {
        return iRectangularPrismViolate.getLength() * iRectangularPrismViolate.getWidth() * iRectangularPrismViolate.getHeight();
    }

}
