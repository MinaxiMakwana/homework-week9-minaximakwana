import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme4_ArrayOfColours {
    //main method
    public static void main(String[] args) {
        //identifying array and assigning colours to the array list
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Indigo");
        colours.add("Violet");
        //print statement for collections
        System.out.println("The colours in the collection are: ");
        //for statement to print name of the colours
        for (String colour : colours){
            System.out.println(colour);
        }
    }
}
