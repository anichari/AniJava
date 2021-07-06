import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        char grade;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a Grade");
        grade = keyboard.next().charAt(0);
        
        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("Great!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good!");
                break;
            case 'C':
            case 'c':
                System.out.println("Do Better!");
                break;
            case 'D':
            case 'd':
                System.out.println("Careful!");
                break;
            case 'F':
            case 'f':
                System.out.println("Failing!");
                break;
            default:
                System.out.println("You have entered an invalid grade");
        }//end switch
    }//end main

}
