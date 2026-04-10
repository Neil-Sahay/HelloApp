/**
 * HelloApp.java - UC6: Use substring() to remove trailing delimiter.
 * Accepts zero or more command-line arguments and prints a greeting.
 * Uses enhanced for loop and StringBuilder, then substring() to remove the last ", ".
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

        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove the trailing comma and space (last 2 characters)
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);
        System.out.println("Hello, " + names + "!");
    }
}