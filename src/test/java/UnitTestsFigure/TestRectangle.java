package UnitTestsFigure;

import figures.Rectangle;
import org.junit.Assert;
import org.junit.Test;


public class TestRectangle
{
    Rectangle rectangle = new Rectangle(3,5);

    @Test
    public void getArea()
    {
        Assert.assertEquals(15, rectangle.Area(), 0.0001);
    }

    @Test
    public void getPerimeter()
    {
        Assert.assertEquals(16, rectangle.Perimeter(), 0.0001);
    }
}
