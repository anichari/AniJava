import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.println("Enter a non negative integer");
        System.out.println("Enter a negative number to exit");
        input = keyboard.nextInt();
        while(input >= 0){
            sum = sum + input;
            System.out.println("Enter a non negative integer");
            System.out.println("Enter a negative number to exit");
            input = keyboard.nextInt();
        }
        System.out.println(sum);
        System.out.println("Done!");

    } // end main

}
