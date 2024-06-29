package attestation.calculator.Presenter;

import attestation.calculator.View.CalculatorView;

public class CalculatorPresenter {
    private CalculatorView view;

    public CalculatorPresenter(CalculatorView view) {
        this.view = view;
    }
    public void startCalculator(){
        view.displayMessage("Введите первое число: ");
        double num1 = view.getInputNumber();

        view.displayMessage("Выберите операцию: \n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление");
        int choice = (int)view.getInputNumber();

        view.displayMessage("Введите второе число: ");
        double num2 = view.getInputNumber();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    view.displayMessage("На ноль делить нельзя!");
                    return;
                }
                break;
            default:
                view.displayMessage("Неверный выбор операции!");
                return;
        }
        
view.displayResult(result);
    }
    
}
