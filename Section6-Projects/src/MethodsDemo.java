public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(1);
        System.out.println(giveMe10());
        System.out.println(addThese(3,4));
        System.out.println(squaredDouble(2.0));
    } //end main
    // void, parametersless method
    public static void printHello() {
        System.out.println("Hello");
    }
    // void parameterized
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }
    // value-returning, parameterless
    public static int giveMe10() {
        return 10;
    }
    // value-returning, parameterized
    public static int addThese(int a, int b) {
        return a + b;
    }
    public static double squaredDouble(double a) {
        return a*a;
    }
}
