import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class QueueStackPalindrome {

    public static void main(String[] args) {

        String word = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert into queue and stack
        for (int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));   // Enqueue
            stack.push(word.charAt(i));  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}