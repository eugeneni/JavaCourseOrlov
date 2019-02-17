package Course;

import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        stringSplit();
    }

    public static void stringSplit() {

        System.out.print("Enter any words: ");
        Scanner scan = new Scanner(System.in);
        String firstString = scan.nextLine();

        String[] splitFirstString = firstString.split("\\s");
        StringBuilder newString = new StringBuilder();

        for (String subStr : splitFirstString) {
            String newReverseWord = new StringBuilder(String.valueOf(subStr)).reverse().toString();
            newString.append(newReverseWord).append(" ");
        }

        System.out.print(newString);
    }
}
