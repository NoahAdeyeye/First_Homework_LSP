package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program to demonstrate the RandomNumberService.
 * 
 * <p>This program invokes the RandomNumberService using different strategies and displays the results.</p>
 * 
 * <p>Demonstrates the Singleton and Strategy Patterns in action.</p>
 * 
 * @author Oluwaseun Noah Adeyeye
 * @version 1.0
 */
public class RandomNumberClient {
    /**
     * Main method to run the client program.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use the built-in random number generator
        service.setStrategy(new BuiltInRandomNumber());
        System.out.println("Built-in Random Number: " + service.generateNumber());

        // Use the custom random number generator
        service.setStrategy(new CustomRandomNumber());
        System.out.println("Custom Random Number: " + service.generateNumber());
    }
}
