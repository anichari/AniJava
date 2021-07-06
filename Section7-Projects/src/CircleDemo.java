public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        printData(c1);
        printData(c2);
        c2.setRadius(12.75);
        printData(c2);

    } // end main
    public static void printData(Circle c) {
        System.out.println("r = " + c.getRadius());
        System.out.println("C = " + String.format("%.2f", c.circumference()));
        System.out.println("A = " + String.format("%.2f", c.area()));
        System.out.println();
    }
}
