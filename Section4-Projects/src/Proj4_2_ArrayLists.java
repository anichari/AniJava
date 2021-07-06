import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> realNumbers = new ArrayList<>();
        String prompt = "Enter a non-negative real number (negative number to stop):\t";
        System.out.print(prompt);
        double value = keyboard.nextDouble();
        while(value >= 0) {
            realNumbers.add(value);
            System.out.print(prompt);
            value = keyboard.nextDouble();
        }
        if (realNumbers.size() > 0) {
            for(int i = realNumbers.size()-1; i >=0; i--) {
                System.out.println(realNumbers.get(i));
            }
        } else {
            System.out.println("No numbers to print!");
        }

    } // end main
}
