import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 *         programmes) using if else and while loop.
 */


public class Programme2_MarkSheet {
    public static void main(String[] args) {
        //identifying scanner and assigning it to the names / roll no. / and subjects
        Scanner p2 = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = p2.nextLine();
        System.out.println("Enter toll number: ");
        int rollNo = p2.nextInt();
        System.out.println("Enter marks for maths (0 - 100): ");
        int mathsMark = p2.nextInt();
        System.out.println("Enter marks for science( 0 - 100): ");
        int scienceMarks = p2.nextInt();
        System.out.println("Enter marks for English (0 - 100):");
        int englishMarks = p2.nextInt();
        //marks can not be entered less than 0 and more than 100
        if (mathsMark <0 || mathsMark >100 || scienceMarks <0 || scienceMarks >100 || englishMarks <0 || englishMarks >100){
            System.out.println("Invalid input, marks should be between 0 to 100");
            return;
        }
        //calculation for marks and convert them into percentage
        int totalMarks = mathsMark + scienceMarks + englishMarks;
        double percentage = (double) totalMarks / 3;
        String result = percentage >35 ? "Pass" : "Fail";
        String grade;
        //if else statement to put students into correct grades
        if (percentage >80){
            grade = "A+";
        } else if (percentage >60){
            grade = "A";
        } else if (percentage >50){
            grade = "B";
        } else if (percentage >35) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        //print statement for mark sheet
        System.out.println("--------------------------------------------------");
        System.out.println("|                                                |");
        System.out.println("| Mark Sheet                                     |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Name:      " + name + "                        |");
        System.out.println("| Roll No:   " + rollNo + "                      |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Subjects:     Marks                            |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Maths:        " + mathsMark + "                |");
        System.out.println("| Science:      " + scienceMarks + "             |");
        System.out.println("| English:      " + englishMarks + "             |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Total:        " + totalMarks + "               |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| Percentage:    " + percentage + "              |");
        System.out.println("| Result:        " + result + "                  |");
        System.out.println("| Grade:         " + grade + "                   |");
        System.out.println("|------------------------------------------------|");
    }
}
