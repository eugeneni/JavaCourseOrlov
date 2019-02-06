package Course;

public class Recursion {

    public static int countInterview(int countEmployee) {

        if (countEmployee <= 1) {
            return 0;
        }
        return countInterview(countEmployee - 1) + (countEmployee - 1);
    }

}
