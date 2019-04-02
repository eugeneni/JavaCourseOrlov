package course;

public class NumbersSum {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static long sumDigits(long num) {
        long sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
