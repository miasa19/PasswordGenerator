import java.security.SecureRandom; // More secure than basic Random()
import java.util.Scanner; // Used for user input
// 🎀

public class PasswordGenerator {

    // The characters we will use when creating passwords
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅabcdefghijklmnopqrstuvwxyzæøå0123456789!@#$%^&*()";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // User input

        // "Welcome" message
        System.out.print("Your old password was 'password123', wasn't it?");
        System.out.print("The hackers thank you. Let's try again!\n");

        System.out.print("How many characters should your password have? ");

        int length = scanner.nextInt(); // User input (password length)

        // String for our method
        String password = generatePassword(length);

        // Shows the user their new password
        System.out.println("\nThere you go: " + password);
        System.out.println("Even I might struggle to remember this one!");

        scanner.close();
    }

    /** 🎀
     * This method generates a random password with the chosen length.
     *
     * @param length The length of the password
     * @return A randomly generated password
     */

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom(); // A cryptographically secure random number generator
        StringBuilder password = new StringBuilder(); // Using StringBuilder because it's more efficient than String

        // Let's create the password, one character at a time!
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length()); // Picks a random letter, number or symbol from our character list
            password.append(CHARACTERS.charAt(index)); // // Adds the chosen character to our password
        }

        return password.toString(); // Returns the final password as a string
    }
}