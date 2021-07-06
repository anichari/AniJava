import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] inputs = new int[5];

        for(int i=0; i< inputs.length; i++) {
            System.out.print("Enter an integer:\t");
            inputs[i] = keyboard.nextInt();
        }
        for(int num: inputs){
            System.out.println(num*2);
        }

    }
}
