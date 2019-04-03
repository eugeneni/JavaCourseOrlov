package figures;

public abstract class AbstractFigure
{
    protected double sizeA;

    public AbstractFigure(double sizeA)
    {
        this.sizeA = sizeA;
    }

    public abstract double Area();

    public abstract double Perimeter();
}
