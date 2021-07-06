import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        String adjective1;
        String girls_name;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boys_name;
        String mans_name;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 adjectives");
        adjective1 = keyboard.next();
        adjective2 = keyboard.next();
        adjective3 = keyboard.next();
        keyboard.nextLine();
        System.out.println("Enter a girl's name, a boy's name and a man's name");
        girls_name = keyboard.next();
        boys_name = keyboard.next();
        mans_name = keyboard.next();
        keyboard.nextLine();
        System.out.println("Enter two occupations");
        occupation1 = keyboard.next();
        occupation2 = keyboard.next();
        keyboard.nextLine();
        System.out.println("Enter a place, clothing and hobby");
        place = keyboard.next();
        clothing = keyboard.next();
        hobby = keyboard.next();

        System.out.println("There once was a " + adjective1 + " girl named " + girls_name + ", who");
        System.out.println("was a " + adjective2 + " " + occupation1 + " in the Kingdom of " + place + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". She wanted to ");
        System.out.println("marry the " + adjective3 + " " + occupation2 + " named " + boys_name + " but her ");
        System.out.println("father, King " + mans_name + " forbid her from seeing him.");

    }
}
