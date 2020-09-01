package Logic.Controllers.Calculating;

import GUI.Elements.Fields.InputField;
import Logic.Enums.CalculatingOperations;
import Logic.Exceptions.DivisionByZeroException;
import Logic.Interfaces.Controller;


public class CalculatingController implements Controller {

    private static double value;
    private static CalculatingOperations calculatingOperation;

    private static double plusOperation() throws NumberFormatException{
        value += Double.parseDouble(InputField.getInputField().getText());
        return value;
    }

    private static double minusOperation() throws NumberFormatException {
        value -= Double.parseDouble(InputField.getInputField().getText());
        return value;
    }

    private static double multiplicationOperation() throws NumberFormatException {
        value *= Double.parseDouble(InputField.getInputField().getText());
        return value;
    }

    private static double divisionOperation() throws NumberFormatException, DivisionByZeroException {
        if (InputField.getInputField().getText() == null) throw new DivisionByZeroException();
        value /= Double.parseDouble(InputField.getInputField().getText());
        return value;
    }

    public static double calculate() {
        double result = 0;
        try {
            if (calculatingOperation == CalculatingOperations.PLUS) {
                result = plusOperation();
            } else if (calculatingOperation == CalculatingOperations.MINUS) {
                result = minusOperation();
            } else if (calculatingOperation == CalculatingOperations.MULTIPLICATION) {
                result = multiplicationOperation();
            } else if (calculatingOperation == CalculatingOperations.DIVISION) {
                try {
                    result = divisionOperation();
                } catch (DivisionByZeroException e) {
                    InputField.getInputField().setText("Division by zero is impossible!");
                }
            }
        }
        catch (NumberFormatException e) {
            InputField.getInputField().setText("Please, input only the numbers");
        }
        value = 0;
        return result;
    }


    public static double getValue() {
        return value;
    }

    public static void setValue(double value) {
        CalculatingController.value = value;
    }

    public static CalculatingOperations getCalculatingOperation() {
        return calculatingOperation;
    }

    public static void setCalculatingOperation(CalculatingOperations calculatingOperation) {
        CalculatingController.calculatingOperation = calculatingOperation;
    }


}
