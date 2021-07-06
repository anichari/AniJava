import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String prompt = "Enter your first and last name:\t";
        String name;
        System.out.print(prompt);
        name = keyboard.nextLine();
        int whereisSpace = name.indexOf(" ");
        String first = name.substring(0, whereisSpace);
        String last = name.substring(whereisSpace+1);
        System.out.println(first.toLowerCase());
        System.out.println(last.toUpperCase());
    }
}
