package Calculate;

public class OperationFactory {

    public BinaryOperation getOperationFor(String operator) {
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
