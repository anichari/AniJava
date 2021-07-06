import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        int whereisSpace;
        StringBuilder prompt = new StringBuilder("Please enter name ");
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        for(int i = 0; i < 5; i ++) {
            System.out.println(prompt + " " + i + ":\t");
            fullName = keyboard.nextLine();
            whereisSpace = fullName.indexOf(" ");
            firstNames.add(fullName.substring(0, whereisSpace));
            lastNames.add(fullName.substring(whereisSpace+1));
        } // end for
        for (String firstName: firstNames) {
            for(String lastName: lastNames) {
                System.out.println(firstName + " " + lastName);
            }
        }
    } // end main
}
