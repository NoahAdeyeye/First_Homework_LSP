package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of RandomNumberStrategy using Java's built-in random number generator.
 * 
 * <p>This strategy generates random positive integers using the Random class.</p>
 * 
 * @author Oluwaseun Noah Adeyeye
 * @version 1.0
 */
public class BuiltInRandomNumber implements RandomNumberStrategy {
    private final Random random = new Random();

    /**
     * Generates a random positive integer.
     * 
     * @return A random positive integer.
     */
    @Override
    public int generate() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensure positive
    }
}
