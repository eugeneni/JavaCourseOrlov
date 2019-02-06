package Figures;

public class Square extends AbstractFigure
{
    public Square(double sizeA)
    {
        super(sizeA);
    }

    public double Area()
    {
        return sizeA * sizeA;
    }

    public double Perimeter()
    {
        return sizeA * 4;
    }

    @Override
    public String toString()
    {
        return "Figures.Square{" +
                "sizeA=" + sizeA +
                '}';
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
