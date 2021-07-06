public class ContinueBreak {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10) {
            if (count == 5){
                count++;
                continue;
            }
            else if (count == 8) {
                System.out.print(count + "\t");
                break;
            }
            System.out.print(count + "\t");
            count ++;
        }
    }
}
