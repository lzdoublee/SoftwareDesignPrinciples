package RactangularPrism.IMPL;

import RactangularPrism.IPrismCalculations;
import RactangularPrism.IRectangularPrism;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class PrismCalculations implements IPrismCalculations {
    public int surfaceArea(IRectangularPrism iRectangularPrism) {
        return 2*((iRectangularPrism.getWidth()*iRectangularPrism.getLength())+(iRectangularPrism.getHeight()*iRectangularPrism.getLength())+(iRectangularPrism.getHeight()*iRectangularPrism.getWidth()));
    }

    public int volume(IRectangularPrism iRectangularPrism) {
        return iRectangularPrism.getHeight()*iRectangularPrism.getLength()*iRectangularPrism.getWidth();
    }

}
