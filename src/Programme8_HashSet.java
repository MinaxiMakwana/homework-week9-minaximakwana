import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme8_HashSet {
    //main method
    public static void main(String[] args) {
        //hashSet to add 4, 7, and 8
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(4);
        num.add(7);
        num.add(8);

        System.out.println("The numbers between 1 and 10 that are in the set are: ");
        //for loop code using if statement for numbers from 1 to 10
        for (int i = 1; i <=10; i++){
            if (num.contains(i)){
                System.out.println(i);
            }
        }
    }
}
