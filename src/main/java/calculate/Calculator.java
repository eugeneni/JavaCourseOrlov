package calculate;

public class Calculator {

    public double calculate(double val1, double val2, String operator) throws Exception {

        BinaryOperation operation = new OperationFactory().getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.returnResultFor(val1, val2);
    }
}
