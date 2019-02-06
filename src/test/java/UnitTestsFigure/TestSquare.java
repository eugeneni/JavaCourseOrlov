package UnitTestsFigure;

import Figures.Square;
import org.junit.Assert;
import org.junit.Test;

public class TestSquare
{
    Square square = new Square(3);

    @Test
    public void getArea()
    {
        Assert.assertEquals(9, square.Area(), 0.0001);
    }

    @Test
    public void getPerimeter()
    {
        Assert.assertEquals(12, square.Perimeter(), 0.0001);
    }
}
