import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Who are you?\n> ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

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
        if (headsCount > tailsCount) {
            System.out.println(userName + " won!");
        } else {
            System.out.println(userName + " lost!");
        }
    }
}
