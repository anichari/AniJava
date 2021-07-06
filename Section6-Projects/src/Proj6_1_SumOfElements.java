import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(12);
        elements.add(134);
        System.out.println(sumElements(elements));
    }
    public static int sumElements(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int num: arrayList) {
            sum += num;
        }
        return sum;
    }
}
