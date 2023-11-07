import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme9_HashMap {
    //main method
    public static void main(String[] args) {
        // HashMap method to store people and their age
        HashMap<String, Integer> family = new HashMap<String, Integer>();
        family.put("Ram", 75);
        family.put("Shyam", 50);
        family.put("Ghanshyam", 25);
        //print statement to see the output
        System.out.println("The values in the map are: " );
        //for loop to identify values
        for (int values : family.values()){
            System.out.println(values);
        }
    }
}
