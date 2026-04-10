/**
 * HelloApp.java - UC5: Enhanced for loop version.
 * Accepts zero or more command-line arguments and prints a greeting.
 * Uses an enhanced for loop (for-each) to process multiple names.
 * If no arguments are provided, displays "Hello, World!".
 * 
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 */
public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}