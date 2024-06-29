package attestation.calculator.View;
import java.util.Scanner;
public class CalculatorView {
   private Scanner scanner;

   public CalculatorView() {
      scanner = new Scanner(System.in);
   }
   public void displayMessage(String message) {
    System.out.println(message);
   }
    public double getInputNumber(){
        return scanner.nextDouble();
    }
    
public void displayResult(double result){
    System.out.println("Результат: "+ result);
}
    

public void displayError(String errorMessage){
    System.out.println(errorMessage);
    }

}

