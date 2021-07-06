public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Ani Chari";
        String name2 = "Ani Chari";
        String name3 = "Aadhav";

        for(int i=0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + ",");
        } // end for
        System.out.println();

        if (name.equals(name2)) {
            System.out.println("Names are equal!");
        }
        else {
            System.out.println("Names aren't equal");
        }
        System.out.println(name.compareTo(name3));

        if(name.compareTo(name3) > 0) {
            System.out.println(name + " is greater than " + name3);
        }
        else if (name.compareTo(name3) < 0) {
            System.out.println(name + " is less than " + name3);
        }

    } //end main
}
