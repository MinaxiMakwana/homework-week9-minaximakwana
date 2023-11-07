package calculate;

/**
 * Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */

public class Calculator {

    //creating first method for addition
    public static void addition(int a, int b){
        System.out.println("Addition of :" + a + " and " + b + " is : " + (a + b));
    }
    //creating second method for Subtraction
    public static void subtraction(int a, int b){
        System.out.println("Subtraction of : " + a + " and " + b + " is : " + (a - b));
    }
    //creating third method for multiplication
   public static void multiplication(int a, int b){
       System.out.println("multiplication of : " + a + " and " + b + " is : " + (a * b));
   }
   //creating fourth method for division
    public static void division(int a, int b){
        System.out.println("Division of :" + a + " and " + b + " is : " + (a / b));
    }
    // creating “calculateResult” method with three parameters - int a, int b and char symbol
    public static void calculateResult(int a, int b, char symbol){
       //using switch statement in the calculate result method
        switch (symbol){
           case '+':
               addition(a, b);
               break;

           case '-':
               subtraction(a, b);
               break;

           case '*':
               multiplication(a, b);
               break;

           case '/':
               division(a, b);
               break;

           default:
               System.out.println("Enter correct symbol");
               break;
       }
    }


}
