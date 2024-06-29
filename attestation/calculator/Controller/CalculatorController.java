package attestation.calculator.Controller;

import attestation.calculator.Presenter.CalculatorPresenter;
import attestation.calculator.View.CalculatorView;

public class CalculatorController {
    public static void main (String[] args){
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(view);
        presenter.startCalculator();
    }
}
