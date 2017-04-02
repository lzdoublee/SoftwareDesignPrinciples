package RactangularPrism.IMPL;

import RactangularPrism.IRectangularPrism;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class RectangularPrism implements IRectangularPrism{

    int length;
    int height;
    int width;
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
