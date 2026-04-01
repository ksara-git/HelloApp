public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder names = new StringBuilder();

        for (String name : args) {
            if (names.length() > 0) {
                names.append(", "); 
            }
            names.append(name);
        }

        System.out.println("Hello, " + names.toString() + "!");
    }
}