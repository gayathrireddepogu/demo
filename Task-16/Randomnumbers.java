package Task16;

import java.util.Random;

public class Randomnumbers {
    public static void main(String[] args) {
        // Creating an instance of Random class
        Random random = new Random();

        // Generating random integers
        int randomNumber = random.nextInt(); // Generates any integer
        System.out.println("Random Number: " + randomNumber);

        // Generating random integers within a specific range
        int minRange = 1;
        int maxRange = 100;
        int randomInRange = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("Random Number in Range: " + randomInRange);

        // Generating random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}
