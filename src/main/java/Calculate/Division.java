package Calculate;

class Division implements BinaryOperation {
    @Override
    public double returnResultFor(double leftOperand, double rightOperand) throws ArithmeticException {
        if (rightOperand == 0){
            throw new ArithmeticException();
        }
        return leftOperand / rightOperand;
    }
}
