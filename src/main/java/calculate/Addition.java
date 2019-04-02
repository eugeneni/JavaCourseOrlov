package calculate;

class Addition implements BinaryOperation {
    @Override
    public double returnResultFor(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }
}
