import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Using reverse string
    public static boolean checkPalindromeReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // Method 2: Using two pointer technique
    public static boolean checkPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using StringBuilder reverse
    public static boolean checkPalindromeStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Algorithm 1
        long start1 = System.nanoTime();
        boolean result1 = checkPalindromeReverse(input);
        long end1 = System.nanoTime();

        // Algorithm 2
        long start2 = System.nanoTime();
        boolean result2 = checkPalindromeTwoPointer(input);
        long end2 = System.nanoTime();

        // Algorithm 3
        long start3 = System.nanoTime();
        boolean result3 = checkPalindromeStringBuilder(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("StringBuilder Method: " + result3 + " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}