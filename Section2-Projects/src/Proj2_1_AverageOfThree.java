import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double numberOne, numberTwo, numberThree, average;

        System.out.println("Enter three Real Numbers");
        numberOne = keyboard.nextDouble();
        numberTwo = keyboard.nextDouble();
        numberThree = keyboard.nextDouble();
        keyboard.nextLine();

        average = (numberOne + numberTwo + numberThree) / 3.0;

        System.out.println("Average of your numbers is " + average);

    }//end main
}
