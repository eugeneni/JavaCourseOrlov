package Course;

public class Equation {

    /*      Задание 1.
            Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
            Каждое решение оформить в отдельном статическом методе.
            x - (y + 123) / z * n  		=> считаем в long
            (x + (50 - y * z) / n) - x 	=> считаем в int
            x / (y * (z - 1) - 564) + n 	=> считаем в float
            -x / -y + z / (n + 15) 		=> считаем в double
    */

    public static long resLong(long x, long y, long z, long n) {
        return x - ((y + 123) / (z * n));
    }

    public static int resInt(int x, int y, int z, int n) {
        return (x + ((50 - (y * z)) / n)) - x;
    }

    public static float resFloat(float x, float y, float z, float n) {
        return (x / ((y * (z - 1)) - 564)) + n;
    }

    public static double resDouble(double x, double y, double z, double n) {
        return (-x / (-y + z)) / (n + 15);
    }
}
