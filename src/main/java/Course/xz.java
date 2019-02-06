package Course;

public class xz {

    public static void main(String[] args){
        int a = 123;
        byte b = (byte) a;
        int c = 7;
        double x = 12.3453325325325;
        // просто так не сможем преобразовать, т.к. на сужение - есть риск потери данных,
        // автоматом не производится, делается вручную, как выше

/*        System.out.println(Integer.toBinaryString(a));
        System.out.println(b);*/

      /*  System.out.println(a + " + " + c + " = " + (a+c));
        System.out.printf("%d +%d = %d", "Res = ", a,c, a+c);
        */

        System.out.format("%.3f%n",x);

    }
}
