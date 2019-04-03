package course;

import validation.ValidatePersonalData;

public class DataBase {
    public static void main(String[] args) {
        memberData();
    }
    public static void memberData() {
        System.out.println("Please, enter your full name: ");

        if (ValidatePersonalData.validateFullName() == true) {
            if (ValidatePersonalData.validatePhoneNumber() == true) {
                if (ValidatePersonalData.validateEmail() == true) {
                    System.out.println(" All data is correct, thank you for registration.");
                }
            }
        }
    }
}