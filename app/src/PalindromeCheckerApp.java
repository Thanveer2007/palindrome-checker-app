//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear characters
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}


