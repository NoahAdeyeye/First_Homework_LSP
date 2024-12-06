package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom implementation of RandomNumberStrategy using a linear congruential generator algorithm.
 * 
 * <p>This strategy generates random positive integers using a simple custom algorithm.</p>
 * 
 * @author Oluwaseun Noah Adeyeye
 * @version 1.0
 */
public class CustomRandomNumber implements RandomNumberStrategy {
    private long seed = System.currentTimeMillis();

    /**
     * Generates a random positive integer.
     * 
     * @return A random positive integer.
     */
    @Override
    public int generate() {
        seed = (seed * 25214903917L + 11) & ((1L << 48) - 1);
        return (int) (Math.abs(seed) % Integer.MAX_VALUE) + 1; // Ensure positive
    }
}
