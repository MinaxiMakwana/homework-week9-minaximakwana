import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme10_UndergroundLine {
    //main method
    public static void main(String[] args) {
        //identifying scanner
        Scanner p10 = new Scanner(System.in);
        //identifying hashmap and array list for train
        HashMap<String, ArrayList<String>> train = new HashMap<String, ArrayList<String>>();
        //making array list 1
        ArrayList<String> central = new ArrayList<String>();
        central.add("Queensway");
        central.add("Marble Arch");
        central.add("Bond Street");
        central.add("Oxford Circus");
        train.put("Central", central);
        //array list 2
        ArrayList<String> bakerloo = new ArrayList<String>();
        bakerloo.add("Edgware Road");
        bakerloo.add("Oxford Circus");
        bakerloo.add("Marylebone");
        train.put("Bakerloo", bakerloo);
        //array list 3
        ArrayList<String> district = new ArrayList<String>();
        district.add("Hammersmith");
        district.add("Putney Bridge");
        district.add("Westminster");
        train.put("District", district);

        //print statement to enter station name
        System.out.println("Enter the station name");
        String station = p10.nextLine(); //assigning scanner to station name

       // boolean found = false;
        //for (String train : train.keySet()){    (train after string giving error - not able to fix it
          //  ArrayList<String> stations = train.get(train); (get is giving error - not able to find how to fix)

        p10.close();
        }
    }

