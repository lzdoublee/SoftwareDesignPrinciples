package ViolatedCube;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class ViolatedPrism extends ViolatedRectangle
{
    private int height;

    public void setLength(int l)
    {
        super.setLength(l);
    }

    public void setBreadth(int b)
    {
        super.setBreadth(b);
    }

    public int area()
    {
        return 2*((getBreadth()*getLength())+(getHeight()*getLength())+(getHeight()*getBreadth()));
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
