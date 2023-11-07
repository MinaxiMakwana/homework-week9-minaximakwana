package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);        //scanner declaration
        //assigning operator for more calculation
        char operator;
        String moreCalculation = "Y";
        //using while loop if user in put Yes for more calculation
        while (moreCalculation.equals(("Y"))) {
            System.out.println("Enter first number: ");
            int num1 = sc1.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc1.nextInt();
            System.out.println("Enter one symbol + , - , * , / ");
            operator = sc1.next().charAt(0);
            int result;
        }

        System.out.println("Enter first number: ");  // assigning scanner to number
        double num1 = sc1.nextDouble();

        System.out.println("Enter second number : ");       //assigning scanner to another number
        double num2 = sc1.nextDouble();

        System.out.println("Please enter one of symbol + , - , * , / ");      //assigning scanner to a symbol
        char symbol = sc1.next().charAt(0);

        sc1.close();        //closing scanner object


    }

       // Calculator.calculateResult();   //trying to call this method from Calculator class to display result
}
