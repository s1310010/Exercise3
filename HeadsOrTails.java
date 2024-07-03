import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;
        
        System.out.println("Tossing a coin...");
        for (int round = 1; round <= 3; round++) {
            String result = random.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + round + ": " + result);
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}
