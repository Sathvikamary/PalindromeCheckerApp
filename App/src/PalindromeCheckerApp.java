import java.util.Scanner;

import static java.util.Scanner.*;

/**
 * =========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * @author Developer
 * @version 2.0
 */
public class PalindromeCheckerApp {

        public static void main(String[] args) {


                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a string to check: ");
                    String input = sc.next();

                    // Normalize the string (optional, but recommended for accuracy)
                    String original = input.toLowerCase();
                    String reversed = "";

                    // Iterate from the last character to the first.
                    for (int i = input.length() - 1; i >= 0; i--) {
                        reversed += original.charAt(i);
                    }

                    // Compare original and reversed strings
                    if (original.equals(reversed)) {
                        System.out.println("The string \"" + input + "\" is a palindrome.");
                    } else {
                        System.out.println("The string \"" + input + "\" is NOT a palindrome.");
                    }

                    sc.close();
                }
            }