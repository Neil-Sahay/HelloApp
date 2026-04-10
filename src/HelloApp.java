/**
 * HelloApp.java - A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given.
 * 
 * Usage: java HelloApp [name]
 *   - If a name is provided, it displays "Hello, [Name]!"
 *   - If no name is provided, it displays "Hello, World!"
 */
public class HelloApp {
    public static void main(String[] args) {
        // Default name
        String name = "World";
        
        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }
        
        System.out.println("Hello, " + name + "!");
    }
}