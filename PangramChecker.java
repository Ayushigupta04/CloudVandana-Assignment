import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity
        scanner.close();

        boolean[] isPresent = new boolean[26]; // 26 letters from 'a' to 'z'

        // Initialize the flag array to false
        for (int i = 0; i < 26; i++) {
            isPresent[i] = false;
        }

        // Iterate through the input and mark the corresponding letters as present
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }

        boolean isPangram = true;

        // Check if all letters are present
        for (int i = 0; i < 26; i++) {
            if (!isPresent[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}