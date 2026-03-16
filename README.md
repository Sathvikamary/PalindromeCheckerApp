/**
* =========================================================
* MAIN CLASS - UseCase9PalindromeCheckerApp
* =========================================================
* Use Case 9: Recursive Palindrome Checker
  */
  public class UseCase9PalindromeCheckerApp {

  public static void main(String[] args) {
  String input = "madam";

       // Initial call to the recursive helper method
       // Start index at 0, end index at the last character
       boolean isPalindrome = check(input, 0, input.length() - 1);

       // Displays the result
       System.out.println("Input : " + input);
       System.out.println("Is Palindrome? : " + isPalindrome);
  }

  /**
  * Recursively checks whether a string is palindrome.
  * * @param s     Input string
  * @param start Starting index
  * @param end   Ending index
  * @return true if palindrome, otherwise false
    */
    private static boolean check(String s, int start, int end) {
    // Base Case 1: If pointers meet or cross, all characters matched
    if (start >= end) {
    return true;
    }

    // Base Case 2: A mismatch is found
    if (s.charAt(start) != s.charAt(end)) {
    return false;
    }

    // Recursive Step: Move inward and check the substring
    return check(s, start + 1, end - 1);
    }
    }