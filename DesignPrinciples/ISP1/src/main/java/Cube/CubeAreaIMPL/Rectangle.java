package Cube.CubeAreaIMPL;

import Cube.CubeArea;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class Rectangle implements CubeArea {
    private int length;
    private int breadth;

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

    public int area() {
        return getBreadth()*getLength();
    }
}
