package Course;

import java.util.Random;

public class PrintArray {

    public static void main(String[] args) {
        randomArray(5);
    }

    public static void randomArray(int arraySize) {
        //  int[] newArray = ThreadLocalRandom.current(array).nextInt(Integer.MAX_VALUE);
        int[] newArray = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(Integer.MAX_VALUE);
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 3 == 0) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}