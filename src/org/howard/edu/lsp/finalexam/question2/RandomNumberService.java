package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using different strategies.
 * 
 * <p>This service provides random numbers based on a selected strategy, implementing the Strategy Pattern.</p>
 * 
 * @author Oluwaseun Noah Adeyeye
 * @version 1.0
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to enforce the Singleton Pattern.
     */
    private RandomNumberService() {}

    /**
     * Retrieves the single instance of the RandomNumberService.
     * 
     * @return The singleton instance of the RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     * 
     * @param strategy The RandomNumberStrategy to use.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random positive integer using the current strategy.
     * 
     * @return A random positive integer.
     * @throws IllegalStateException If no strategy has been set.
     */
    public int generateNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.generate();
    }
}
