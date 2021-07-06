import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        fillCircles(circles);
        printCircles(circles);
    } // end main
    public static void fillCircles(ArrayList<Circle> circles) {
        try {
            Scanner inFile = new Scanner(new File("circle_data.txt"));
            while (inFile.hasNext()) {
                circles.add(new Circle(inFile.nextDouble()));
            }
        }
        catch (FileNotFoundException | InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static void printCircles(ArrayList<Circle> circles) {
        try {
            PrintWriter pw = new PrintWriter("circles_output.txt");
            for (Circle c: circles) {
                String circleData = c.getCircleData();
                System.out.println(circleData);
                pw.println(circleData);
            }
            pw.close();
        }
        catch (FileNotFoundException | InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
