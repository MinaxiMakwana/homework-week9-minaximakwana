import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme6_RetrieveElement {
    //main method
    public static void main(String[] args) {
        //creating scanner method
        Scanner p6 = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        //print statement to print the index of the element
        System.out.println("Enter the index of the element you want to retrieve: ");
        //assigning scanner for index and to retrieve a days of the week
        int index = p6.nextInt();
        //If else statement for index
        if (index >= 0 && index < days.size()){
            String element = days.get(index);
            System.out.println("The element at index " + index + " is " + element);
        } else {
            System.out.println("Invalid index");
        }
        p6.close(); //closing scanner
    }
}
