public class StringMethodsPart2 {
    public static void main(String[] args) {
        String name = "Ani Chari";
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();

        int whereisC = name.indexOf("C");
        String lastName = name.substring(4);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("C is at index " + whereisC);
        System.out.println("Last Name is " + lastName);
    } // end main
}
