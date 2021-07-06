import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numsFile;
        PrintWriter pw;
        int tempNum;
        try {
            numsFile = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");
            while(numsFile.hasNext()) {
                tempNum = numsFile.nextInt();
                tempNum *= 2;
                pw.println(tempNum);
            }
            numsFile.close();
            pw.close();
        }
        catch (FileNotFoundException | InputMismatchException ex) {
            System.out.println(ex.getMessage());
        } // end try-catch
    } // end main
}
