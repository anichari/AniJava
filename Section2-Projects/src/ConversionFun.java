
public class ConversionFun {
    public static void main(String[] args) {
        double myDouble = 3.14;
        float myFloat = (float)3.14;
        float myFloat2 = 3.14f; // narrowing/lossy conversion
        double yourDouble = myFloat; // widening/lossless conversion
    } //end main
}
