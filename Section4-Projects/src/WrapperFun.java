import java.util.ArrayList;
public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();
        myAL.add(new Integer(10));
        myAL.add(22);

        for(int i=0; i < myAL.size(); i++) {
            System.out.println(myAL.get(i));
        } // end for

        String someValue  = "450";
        int numericValue = Integer.parseInt(someValue);
        System.out.println(numericValue + 10);

        String doubleValue = "3.14159";
        double doubVal = Double.parseDouble(doubleValue);
        System.out.println(doubVal*2);

    } // end main
}
