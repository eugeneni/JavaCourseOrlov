package Figures;

public class Triangle extends AbstractFigure
{
    private double sizeB;
    private double sizeC;

    public Triangle(double sizeA, double sizeB, double sizeC)
    {
        super(sizeA);
        this.sizeB = sizeB;
        this.sizeC = sizeC;
    }

    public double Area()
    {
        double p = Perimeter() / 2;
        return Math.sqrt(p * (p - sizeA) * (p - sizeB) * (p - sizeC));
    }

    public double Perimeter()
    {
        return sizeA + sizeB + sizeC;
    }
}
