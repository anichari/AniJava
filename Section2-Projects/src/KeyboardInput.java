import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double realNumber;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("What's your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); // to workaround the fact that nextInt doesn't consume newline
        System.out.println("age is " + age);

        System.out.println("Enter a Real Number:");
        realNumber = keyboard.nextDouble();
        realNumber *= 2;
        keyboard.nextLine();
        System.out.println("Real Number twice is " + realNumber);


        System.out.println("What city do you live in?");
        city = keyboard.nextLine();
        System.out.println("City is " + city);

    }//end main
}
