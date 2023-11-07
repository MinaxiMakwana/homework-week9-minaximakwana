import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class Programme7_ArrayListIsEmpty {
    public static void main(String[] args) {
        //array list using names
        ArrayList<String> testNG = new ArrayList<String>();
        testNG.add("Minaxi");
        testNG.add("Annapoorna");
        testNG.add("Kirti");
        testNG.add("Prexa");
        testNG.add("Nandini");
        //if else statement and print statement to display names array - if it's empty or not
        if (testNG.isEmpty()){
            System.out.println("Name list is Empty");
        } else {
            System.out.println("Name list is not empty");
        }
    }
}
