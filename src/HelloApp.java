/**
 * HelloApp.java - A simple Java application that accepts a user's name
 * as a command-line argument and displays a personalized greeting.
 * If no argument is provided, it defaults to "Hello, World!"
 */
public class HelloApp {
    public static void main(String[] args) {
        // Check if a command-line argument was provided
        if (args.length > 0) {
            // Use the first argument as the name
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default greeting if no argument
            System.out.println("Hello, World!");
        }
    }
}