package Figures;

public class Rectangle extends AbstractFigure
{
    private double sizeB;

    public Rectangle(double sizeA, double sizeB)
    {
        super(sizeA);
        this.sizeB = sizeB;
    }

    public double Area()
    {
        return sizeA * sizeB;
    }

    public double Perimeter()
    {
        return 2 * (sizeA + sizeB);
    }
}
