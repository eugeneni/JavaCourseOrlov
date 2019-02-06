import Course.*;

import javax.swing.text.rtf.RTFEditorKit;

public class RunMain {

    public static void main(String[] args) {
        System.out.println("res for long = " + Equation.resLong(122222,12221,23342,543643));
        System.out.println("res for int = " + Equation.resInt(12,11,22,33));
        System.out.println("res for double = " + Equation.resDouble(12.325,11.574,22.685684,33.68457357));
        System.out.println("res for float = " + Equation.resFloat(12.4677f,11.4677f,45.4677f,67.4677f));

        //Numbers.massivNumbers(123456789);

        //VectorСoordinates.vector(5,0,0);

        //Palindrome.palindromeVerify();

       // NumbersSum.sumDigits(123);

       // System.out.println(Recursion.countInterview(4));

        //Split.stringSplit("Привет чувак, как дела?");

        //DataBase.memberData();
    }

}
