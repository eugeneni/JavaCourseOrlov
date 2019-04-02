package calculate;

public class Multiplication implements BinaryOperation {

    @Override
    public double returnResultFor(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }

}