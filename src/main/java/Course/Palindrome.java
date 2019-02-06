package Course;

import java.util.Scanner;

public class Palindrome {

    public static void palindromeVerify() {
        System.out.println("Enter any word: ");

        Scanner scan = new Scanner(System.in);

        String palindrome = scan.nextLine();
        String reverse = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse + palindrome.charAt(i);
        }

        if (palindrome.equals(reverse)) {
            System.out.println("YES, it is palindrome");
        } else {
            System.out.println("NO, it is not palindrome");
        }

        System.out.println("Reversed word is: " + reverse);
    }

/*    public static void palindromeVerifySec() {
        System.out.println("Enter any word: ");

        Scanner scan = new Scanner(System.in);

        String palindrome = scan.nextLine();
        String reverse = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(reverse)) {
            System.out.println("YES, it is palindrome");
        } else {
            System.out.println("NO, it is not palindrome");
        }

        System.out.println("Reversed word is: " + reverse);
    }*/
}
