package course;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        palindromeVerify();
    }

    public static void palindromeVerify() {
        //second example
        System.out.print("Enter any word: ");
        Scanner scan = new Scanner(System.in);

        String firsrString = scan.nextLine();
        String secondString = new StringBuilder(String.valueOf(firsrString)).reverse().toString();

        if (firsrString.equals(secondString)) {
            System.out.println("YES, it is palindrome");
        } else {
            System.out.println("NO, it is not palindrome");
        }

        //first example
/*        System.out.print("Enter any word: ");

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

        System.out.println("Reversed word is: " + reverse);*/
    }
}
