package Calculate;

public class Root implements BinaryOperation {
    @Override
    public double returnResultFor(double leftOperand, double rightOperand) {
        return Math.pow(leftOperand,1/rightOperand);
    }
}
