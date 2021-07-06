import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        Scanner rectFile;
        Rectangle tempRect;
        try {
            rectFile = new Scanner(new File("rectangle_data.txt"));
            while(rectFile.hasNext()) {
                tempRect = parseInput(rectFile.nextLine());
                tempRect.printData();
            }
            rectFile.close();
        }
        catch (FileNotFoundException | InputMismatchException ex) {
            System.out.println("Couldn't read file!");
        } // end try-catch
    } // end main
    public static Rectangle parseInput(String line) {
        double length = 1.0;
        double width = 1.0;
        int whereIsSpace = line.indexOf(" ");
        if (whereIsSpace >= 0) {
            length = Double.parseDouble(line.substring(0, whereIsSpace));
            width = Double.parseDouble(line.substring(whereIsSpace+1));
        }
        return new Rectangle(length, width);
    }
}
