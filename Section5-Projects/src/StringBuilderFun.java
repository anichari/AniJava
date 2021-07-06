public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ani Chari");
        sb.append(" is awesome");
        System.out.println(sb);
        sb.insert(4, "M ");
        System.out.println(sb);
        sb.replace(15, 22, "amazing");
        System.out.println(sb);
        sb.delete(4 , 6);
        System.out.println(sb);
    } // end main
}
