package Course;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

/*

    Задание 2.
    Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, слева-направо. Число задается в параметре статического метода.
    Каждую цифру вывести в отдельной строке.
            45685
            4
            5
            6
            8
            5
*/

    public static void massivNumbers(int num) {
        int ostatok = 0;
        List<Integer> res = new ArrayList<Integer>();

        while (num > 0) {
            ostatok = num % 10;
            res.add(ostatok);
            num = num / 10;
        }

        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.println(res.get(i));
        }
    }
}



