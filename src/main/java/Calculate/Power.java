package Calculate;

public class Power implements BinaryOperation {
    @Override
    public double returnResultFor(double leftOperand, double rightOperand) {
        return Math.pow(leftOperand,rightOperand);
    }
}
