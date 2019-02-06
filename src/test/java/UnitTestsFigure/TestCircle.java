package UnitTestsFigure;

import Figures.Circle;
import org.junit.Assert;
import org.junit.Test;

public class TestCircle
{
    Circle circle = new Circle(3);

    @Test
    public void getArea()
    {
        Assert.assertEquals(28.2743, circle.Area(), 0.0001);
    }

    @Test
    public void getPerimeter()
    {
        Assert.assertEquals(18.8495, circle.Perimeter(), 0.0001);
    }
}
