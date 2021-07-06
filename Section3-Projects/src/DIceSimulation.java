import java.util.Random;
public class DIceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=1; i<=10; i++){
            System.out.println("Die Roll #" + i + "\t:\t" + (random.nextInt(6) + 1));
        }
    } // end main
}
