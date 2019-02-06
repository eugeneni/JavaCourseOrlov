package UnitTestRating;

import Rating.Rating;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class RatingTest
{
    Rating rating;

    @Before
    public void setUp()
    {
        rating = new Rating();
    }

    @Test
    public void studentMark_1_Test()throws Exception
    {
        String res = rating.studentMark(1);
        Assert.assertEquals("E", res);
    }

    @Test
    public void studentMark_2_Test()throws Exception
    {
        String res = rating.studentMark(2);
        Assert.assertEquals("D", res);
    }

    @Test
    public void studentMark_3_Test()throws Exception
    {
        String res = rating.studentMark(3);
        Assert.assertEquals("D", res);
    }

    @Test
    public void studentMark_4_Test()throws Exception
    {
        String res = rating.studentMark(4);
        Assert.assertEquals("C", res);
    }

    @Test
    public void studentMark_5_Test()throws Exception
    {
        String res = rating.studentMark(5);
        Assert.assertEquals("C", res);
    }

    @Test
    public void studentMark_6_Test() throws Exception
    {
        String res = rating.studentMark(6);
        Assert.assertEquals("C", res);
    }

    @Test
    public void studentMark_7_Test()throws Exception
    {
        String res = rating.studentMark(7);
        Assert.assertEquals("B", res);
    }

    @Test
    public void studentMark_8_Test()throws Exception
    {
        String res = rating.studentMark(8);
        Assert.assertEquals("B", res);
    }

    @Test
    public void studentMark_9_Test()throws Exception
    {
        String res = rating.studentMark(9);
        Assert.assertEquals("B", res);
    }

    @Test
    public void studentMark_10_Test() throws Exception
    {
        String res = rating.studentMark(10);
        Assert.assertEquals("A", res);
    }

    @Test
    public void studentMark_11_Test() throws Exception
    {
        String res = rating.studentMark(11);
        Assert.assertEquals("A", res);
    }

    @Test
    public void studentMark_12_Test() throws Exception
    {
        String res = rating.studentMark(12);
        Assert.assertEquals("A", res);
    }

    @Test(expected = Exception.class)
    public void studentMark_Exeption0_Test() throws Exception
    {
        rating.studentMark(0);
    }

    @Test(expected = Exception.class)
    public void studentMark_ExeptionMin1_Test() throws Exception
    {
        rating.studentMark(-1);
    }

    @Test(expected = Exception.class)
    public void studentMark_Exeption12_Test() throws Exception
    {
        rating.studentMark(13);
    }
}
