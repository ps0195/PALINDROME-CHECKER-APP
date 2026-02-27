import java.util.ArrayDeque;

class PalindromeApp {

    public static void main(String[] args) {

        // Application details
        String appName = "Palindrome Checker";
        String version = "Version 1.0";

        // Display welcome message
        System.out.println("Welcome to " + appName);
        System.out.println(version);
        System.out.println("Application started successfully.");

        // Continue to next use case or exit
        System.out.println("Ready for palindrome processing...");
    }
}

class HardcodedPalindrome {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string

        if (word.equals("madam")) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

class ReverseStringPalindrome {

    public static void main(String[] args) {

        String original = "level";
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare using equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

class CharArrayPalindrome {

    public static void main(String[] args) {

        String word = "radar";
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer technique
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
