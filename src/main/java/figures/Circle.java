package figures;

public class Circle extends AbstractFigure
{
    public Circle(double sizeA)
    {
        super(sizeA);
    }

    public double Area()
    {
        return Math.PI * (Math.pow(sizeA, 2));
    }

    public double Perimeter()
    {
        return 2 * Math.PI * sizeA;
    }
}
