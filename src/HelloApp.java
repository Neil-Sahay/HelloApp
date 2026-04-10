/**
 * HelloApp.java - A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 * 
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 *   - If names are provided, it displays "Hello, Name1, Name2, ...!"
 *   - If no names are provided, it displays "Hello, World!"
 */
public class HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length > 0) {
            // Join all arguments with ", " using String.join (Java 8+)
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}