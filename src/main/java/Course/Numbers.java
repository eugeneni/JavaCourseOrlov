package Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

/*
    Задание 2.
    Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо.
    Число задается в параметре статического метода.
    Каждую цифру вывести в отдельной строке.
            45685
            4
            5
            6
            8
            5
*/

    public static List<Integer> arrayNumbers(int num) {

        List<Integer> res = new ArrayList<Integer>();

        while (num > 0) {
            int ostatok = num % 10;
            res.add(ostatok);
            num = num / 10;
        }

        //Collections.reverse(res);

        return Numbers.reverceNum(res);
    }

    public static List<Integer> reverceNum(List<Integer> num) {
        int arraySize = num.size();
        int middleArraySize = arraySize / 2;

        Integer[] tmpList = num.toArray(new Integer[arraySize]);

        for (int i = 0; i <= middleArraySize; i++) {
            int temp = tmpList[arraySize - 1 - i];
            tmpList[arraySize - 1 - i] = tmpList[i];
            tmpList[i] = temp;
        }

        return Arrays.asList(tmpList);
    }

    public static void printArrayReverseNum(int num) {
        List<Integer> res = Numbers.arrayNumbers(num);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}



