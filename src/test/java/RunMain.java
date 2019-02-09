import Course.*;

public class RunMain {

    public static void main(String[] args) {
        System.out.println("res for long = " + Equation.resLong(536346, 12221, 23342, 543643));
        System.out.println("res for int = " + Equation.resInt(12, 11, 22, 33));
        System.out.format("%.2f%n", + Equation.resDouble(12.325, 11.574, 22.685684, 33.68457357));
        System.out.format("%.2f%n", + Equation.resFloat(12.4677f, 11.4677f, 45.4677f, 67.4677f));

        //Вывод числа по символам
        Numbers.printArrayReverseNum(12345);

        VectorСoordinates.vector(5,0,0);

    }
}
