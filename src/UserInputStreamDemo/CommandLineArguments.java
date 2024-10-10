package UserInputStreamDemo;

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Number of arguments: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}
