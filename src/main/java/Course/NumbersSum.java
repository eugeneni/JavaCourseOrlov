package Course;

public class NumbersSum {

    public static void sumDigits(long num) {
        long sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }
}
