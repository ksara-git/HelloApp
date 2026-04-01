public class HelloAppUC6 {

    public static void main(String[] args) {

        // Case 1: No arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present
        StringBuilder nameBuilder = new StringBuilder();

        // Append all names with ", "
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = "";
        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Print final output
        System.out.println("Hello, " + names + "!");
    }
}