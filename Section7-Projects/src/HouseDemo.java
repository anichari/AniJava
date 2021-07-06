public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "Blue");


        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("Blue");

        myHouse.printData();
        yourHouse.printData();

        printHouseData(myHouse);
        printHouseData(yourHouse);
    } // end main

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() +
                "\n and has ");
    }
}
