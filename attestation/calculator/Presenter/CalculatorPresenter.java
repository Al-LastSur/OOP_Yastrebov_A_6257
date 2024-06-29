package attestation.calculator.Presenter;

import attestation.calculator.Service.AdditionOperation;
import attestation.calculator.Service.DivisionOperation;
import attestation.calculator.Service.MultiplicationOperation;
import attestation.calculator.Service.Operation;
import attestation.calculator.Service.SubstractionOperation;
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
        int choice = (int) view.getInputNumber();

        view.displayMessage("Введите второе число: ");
        double num2 = view.getInputNumber();

        Operation operation = null;
        if (choice == 1) {
            operation = new AdditionOperation();
        } else if (choice == 2) {
            operation = new SubstractionOperation();
        } else if (choice == 3){
            operation = new MultiplicationOperation();
        } else if (choice == 4){
            operation = new DivisionOperation();
        } else {
            view.displayMessage("Неверный выбор операции!");
                return;
        }



    double result = operation.perform(num1, num2);    
    view.displayResult(result);
    }
    
}
