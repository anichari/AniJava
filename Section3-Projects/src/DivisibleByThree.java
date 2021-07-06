import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        number = keyboard.nextInt();
        System.out.print(number + " is ");
        if (number % 3 != 0) {
            System.out.print("NOT ");
        }
        System.out.print("divisible by 3!");
    }
}
