import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */


public class Programme11_ArrayListToCompare {
    //main method
    public static void main(String[] args) {
        //First array list
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        //second array list
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black"); //missing white colour
        c2.add("Pink");

        //if else statement to compare the two lists
        if (c1.equals(c2)){
            System.out.println("The two array lists are equal");
        } else {
            System.out.println("The two array lists are not equal");
        }
    }
}
