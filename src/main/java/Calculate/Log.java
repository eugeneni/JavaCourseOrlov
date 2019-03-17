package Calculate;

public class Log implements BinaryOperation {
    @Override
    public double returnResultFor(double leftOperand, double rightOperand) {
        return Math.log (leftOperand) / Math.log (rightOperand);
    }
}
