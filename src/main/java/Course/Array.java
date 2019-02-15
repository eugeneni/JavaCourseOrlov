package Course;

import java.util.Random;

public class Array {

    public static void randomArray(int arrayNumber) {
        //  int[] newArray = ThreadLocalRandom.current(array).nextInt(Integer.MAX_VALUE);
        int[] newArray = new int[arrayNumber];

        for (int i = 10; i < newArray.length; i++) {
            newArray[i] = new Random().nextInt(arrayNumber);
            System.out.print(newArray[i] + ", ");

            if(newArray[i] % 3 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}