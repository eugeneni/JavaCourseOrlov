package UnitTestsCourse;

import course.Equation;
import org.junit.Assert;
import org.junit.Test;

public class FirstHW {
    @Test
    public void resForLong()throws Exception
    {
        long res = Equation.resLong(1234567890,552352335,23352357, 53258423);
        Assert.assertEquals(1234567890, res);
    }

    @Test
    public void resForInt()throws Exception
    {
        int res = Equation.resInt(1,2,3, 4);
        Assert.assertEquals(11, res);
    }

    @Test
    public void resForDouble()throws Exception
    {
        double res = Equation.resDouble(1.1,2.2,3.3, 4.4);
        Assert.assertEquals(-0.051, res, 0.001);
    }

    @Test
    public void resForFloat()throws Exception
    {
        float res = Equation.resFloat(1.1234f,2.2345f,3.36789f, 4.4876544444f);
        Assert.assertEquals(4.485, res, 0.001);
    }
}
