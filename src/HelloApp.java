/**
 * HelloApp.java - UC7: Use String.join() to concatenate multiple names.
 * Accepts zero or more command-line arguments and prints a greeting.
 * Uses String.join(", ", args) for efficient concatenation.
 * If no arguments, displays "Hello, World!".
 * 
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
        
        String names = String.join(", ", args);
        System.out.println("Hello, " + names + "!");
    }
}