package Project;

public class CalculatorMain 
{
 public static void main(String[] args) 
 {			
     Calculator calculator = new Calculator(10.50, 15.50, "addition");
     double additionResult = calculator.calculate();
     System.out.println("Addition Result: " + additionResult);
     
     calculator = new Calculator(20.50, 10.50, "subtraction");
     double subtractionResult = calculator.calculate();
     System.out.println("Subtraction Result: " + subtractionResult);
     
     calculator = new Calculator(10.50, 5.50, "multiplication");
     double multiplicationResult = calculator.calculate();
     System.out.println("Multiplication Result: " + multiplicationResult);
     
     calculator = new Calculator(10.5, 5.5, "division");
     double divisionResult = calculator.calculate();
     System.out.println("Division Result: " + divisionResult);
 }
}

package Project;

public class Calculator 
{
  private double a;
  private double b;
  private String operation;
  
  public Calculator(double a, double b, String operation) 
    {
      this.a = a;
      this.b = b;
      this.operation = operation;
    }
  
  public double calculate() 
     {
      double result = 0;
      
      switch(operation) 
         {
          case "addition": result = a + b;
          break;
          case "subtraction": result = a - b;
          break;
          case "multiplication": result = a * b;
          break;
          case "division":  if (b != 0) 
				{
                                result = a / b;
              		} 
			      else 
				{
                                System.out.println("Error: Division by zero");
              		}
          break;    
          default: System.out.println("Error: Invalid operation");
          break;
         }
      
  return result;
  }
}


