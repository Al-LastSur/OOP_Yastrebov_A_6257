package attestation.calculator.Service;

public class SubstractionOperation extends Operation {
    @Override
    public double perform(double operand1, double operand2) {
        return operand1 - operand2;
    }
}