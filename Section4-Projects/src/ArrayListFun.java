import java.util.ArrayList;
public class ArrayListFun {
    public static void main(String[] args) {
            ArrayList<String> namesList = new ArrayList<>();

            namesList.add("Ani");
            namesList.add("Aadhav");
            namesList.add("Pavi");
            namesList.add("Aadhira");
            namesList.add("Chewbacca");

//            for(int i = 0; i < namesList.size(); i++) {
//                System.out.println(namesList.get(i));
//            }
            for (String name : namesList) {
                System.out.println(name);
            }
    } // end main

}
