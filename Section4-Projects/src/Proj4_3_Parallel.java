import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        String namePrompt = "Enter a Name:\t";
        String agePrompt = "Enter their age:\t";
        for(int i=0; i<5; i++) {
            System.out.print(namePrompt);
            names.add(keyboard.nextLine());
            System.out.print(agePrompt);
            ages.add(keyboard.nextInt());
            // consume newline
            keyboard.nextLine();
        } // end for
        for(int i=0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old!");
        }// end for
    } // end main
}
