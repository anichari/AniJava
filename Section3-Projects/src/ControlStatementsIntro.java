import java.util.Scanner;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.print("What's your age?\t");
        age = keyboard.nextInt();
        keyboard.nextLine();

        if(age >= 16) {
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You cannot drive yet!");

        }
        System.out.println();

        for(int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);
        }

    }// end main
}
