package Course;

public class VectorСoordinates {

/*    Задание 3.
    Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.

    Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.

    Длина вектора - Math.sqrt(X * X + Y * Y + Z * Z)

    Пример:
    Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)
*/

    public static void vector (double x, double y, double z){

        double vectorLength = Math.sqrt(x*x + y*y + z*z);

        System.out.println("x = " + x/vectorLength);
        System.out.println("y = " + y/vectorLength);
        System.out.println("z = " + z/vectorLength);

    }

}
