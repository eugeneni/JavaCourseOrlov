package UnitTestsFigure;

import figures.Triangle;
import org.junit.Assert;
import org.junit.Test;


public class TestTriangle
{
    Triangle triangle = new Triangle(3,5,7);

    @Test
    public void getArea()
    {
        Assert.assertEquals(6.4951, triangle.Area(), 0.0001);
    }

    @Test
    public void getPerimeter()
    {
        Assert.assertEquals(15, triangle.Perimeter(), 0.0001);
    }
}
