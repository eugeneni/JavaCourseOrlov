package calculate;

class OperationFactory {

    BinaryOperation getOperationFor(String operator) {
        switch (operator) {
            case "*":
                return new Multiplication();
            case "-":
                return new Subtraction();
            case "/":
                return new Division();
            case "+":
                return new Addition();
            case "^":
                return new Power();
            case "sqrt":
                return new Root();
            case "log":
                return new Log();
            default:
                return null;
        }
    }
}
