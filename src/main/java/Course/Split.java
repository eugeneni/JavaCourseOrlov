package Course;

import java.util.Scanner;

public class Split {

    public static void stringSplit() {

        System.out.print("Enter any words: ");
        Scanner scan = new Scanner(System.in);
        String firstString = scan.nextLine();

        String[] secondString = firstString.split("\\s");

        for (String subStr : secondString) {
            String newReverseString = new StringBuilder(String.valueOf(subStr)).reverse().toString();
            System.out.print(newReverseString);
        }
    }
}
