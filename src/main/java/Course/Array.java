package Course;

public class Array {

    public static void someNumbers(int num) {
        int[] array = new int[num];

        for (int i = 10; i <= 100; i++) {
            array[i] = i;
            System.out.println(array);
        }
    }
}