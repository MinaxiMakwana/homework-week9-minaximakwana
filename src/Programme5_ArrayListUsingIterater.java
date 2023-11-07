import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Programme5_ArrayListUsingIterater {
    //main method
    public static void main(String[] args) {
        ///identifying array and assigning five colours to the array list
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("violet");
        //Print statement to print rainbow colours
        System.out.println("The colours in the rainbow are : ");

        //assigning iterater within while loop function
        Iterator<String> iterator = colours.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
