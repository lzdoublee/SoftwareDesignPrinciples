package Cube.CubeAreaIMPL;

import Cube.CubeArea;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class Prism implements CubeArea {
    private int length;
    private int breadth;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        this.breadth = b;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int area() {
        return 2*((getBreadth()*getLength())+(getHeight()*getLength())+(getHeight()*getBreadth()));
    }
}
