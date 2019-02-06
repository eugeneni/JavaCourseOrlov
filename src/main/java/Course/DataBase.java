package Course;

import Validation.ValidatePersonalData;

public class DataBase {

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