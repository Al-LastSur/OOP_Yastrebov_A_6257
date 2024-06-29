package attestation.calculator.Service;

public class DivisionOperation extends Operation {
    @Override
    public double perform(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }
}