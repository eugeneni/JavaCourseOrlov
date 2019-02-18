package Validation;

import java.util.Scanner;

public class ValidatePersonalData {
    static String fullName;
    static String phoneNumber;
    static String email;

    static Scanner scan = new Scanner(System.in);

    public static boolean validateFullName() {
        fullName = scan.nextLine();
        if (fullName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {
            System.out.println(fullName + " is correct full name. Please, enter your phone number: ");
            return true;
        }
        System.out.println(fullName + " is wrong name, please enter correct name.");
        return validateFullName();
    }

    public static boolean validatePhoneNumber() {
        phoneNumber = scan.nextLine();
        if (phoneNumber.matches("\\+\\d{3}\\d{2}\\d{7}")) {
            System.out.println(phoneNumber + " is correct phone. Please, enter your email: ");
            return true;
        }
        System.out.println(phoneNumber + " is wrong phone, please enter correct phone.");
        return validatePhoneNumber();
    }

    public static boolean validateEmail() {
        email = scan.nextLine();
        if (email.matches("([A-Za-z0-9]{1,}[\\\\.-_]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\\\.-_]{0,1}[A-Za-z0-9]{1,})+[\\\\.]{1}[a-z]{2,4}")) {
            System.out.print(email + " is correct email.");
            return true;
        }
        System.out.println(email + " is wrong email, please enter correct email.");
        return validateEmail();
    }
}