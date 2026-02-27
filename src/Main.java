import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Palindrome Checker App ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: Palindrome ✅");
        } else {
            System.out.println("Result: Not a Palindrome ❌");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {

        String cleaned = word.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}