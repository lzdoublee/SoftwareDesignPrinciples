package Shapes;

/**
 * Created by L.z Double E on 4/1/2017.
 */
public class Rectangle extends Shapes{

    private int breadth;
    private int length;

    @Override
    public int area() {
        return getLength()*getBreadth();
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
