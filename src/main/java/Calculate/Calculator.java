package Calculate;

public class Calculator {

    public double calculate(double val1, double val2, String operator) throws Exception {

        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.returnResultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("^".equals(operator)) {
            return new Power();
        }else if ("sqrt".equals(operator)) {
            return new Root();
        }else if ("log".equals(operator)) {
            return new Log();
        }

        return null;
    }
}
