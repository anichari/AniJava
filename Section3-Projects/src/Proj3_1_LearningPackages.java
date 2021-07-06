import sun.security.x509.OtherName;

import java.util.Scanner;
public class Proj3_1_LearningPackages {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageId, totalCourses, totalCost, packageCost, courseCost;
        String promptPackage, promptTotalCourses;
        promptPackage = "Choose the Package number:\n" +
                "1 for 'Learning Package 1'\n" +
                "2 for 'Learning Package 2'\n" +
                "3 for 'Learning Package 3'\n" + ":";
        promptTotalCourses = "How many total courses?\t";
        System.out.println(promptPackage);
        packageId = keyboard.nextInt();
        System.out.println(promptTotalCourses);
        totalCourses = keyboard.nextInt();
        while (0 < packageId & packageId < 4) {
            totalCost = 0;
            courseCost = 0;
            packageCost = 0;
            switch(packageId) {
                case 1: {
                    packageCost = 10;
                    courseCost = 6*(totalCourses-2);
                    break;
                }
                case 2: {
                    packageCost = 12;
                    courseCost = 4*(totalCourses-4);
                    break;
                }
                case 3: {
                    packageCost = 15;
                    courseCost = 3*(totalCourses-6);
                    break;
                }
            }
            totalCost += packageCost;
            if (courseCost > 0) {
                totalCost += courseCost;
            }
            System.out.println("Total Cost is:\t" + totalCost);
            System.out.println(promptPackage);
            packageId = keyboard.nextInt();
            System.out.println(promptTotalCourses);
            totalCourses = keyboard.nextInt();
        }
        System.out.println("Invalid Package ID entered! Bye");
    }
}
