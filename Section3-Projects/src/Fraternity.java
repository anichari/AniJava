import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;
    char gender;
    System.out.print("Enter your age:\t");
    age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Enter your gender (M or F):\t");
    gender = keyboard.next().charAt(0);
    keyboard.nextLine();

    if (age >= 19 && (gender == 'M' || gender == 'm')) {
        System.out.println("Welcome to the Fraternity!");
    }
    else {
        System.out.println("Sorry, you are not eligible!");
    }

    }//end main

}
