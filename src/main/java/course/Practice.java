package course;

import java.util.Scanner;

public class Practice {

    public static double Price() {
        double resFirst;
        double resSecond;
        double resSumBuy;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стоимость 1-ого кг конфет: ");
        double priceCandy = scan.nextInt();

        System.out.println("Введите стоимость 1-ого кг печенья: ");
        double priceCookie = scan.nextInt();

        resFirst = priceCandy * 0.3 + priceCookie * 0.4;
        resSecond = 3 * (priceCookie * 2 + priceCandy * 1.8);

        System.out.format("%.2f%n", resFirst);
        System.out.format("%.2f%n", resSecond);

        resSumBuy = resFirst + resSecond;
        System.out.printf("%.2f%n", resSumBuy);

        return resSumBuy;
    }

    public static int Speed(int timeMin, int distanceKl) {
        int meter = distanceKl * 1000;
        int sec = timeMin * 60;
        int speed = meter / sec;

        System.out.println("speed = " +
                speed);

        return speed;
    }

    public static void printTriangle(int rectangle) {
        for (int i = 0; i <= rectangle; i++){

            //Левое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("+");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("+");
            }

            //Правое пустое пространство
            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);
        }
    }

    public static void exampleArray(){
        int[] someArr = new int[100];
       // for (int i = 0; i < someArr.length; i++){
           // someArr[i] = i +1;
            //System.out.println(someArr[i]);}
           // System.out.println(Arrays.toString(someArr));



/*        //false
        String str1 = "Jack";
        String str2 = new String("Jack");
        System.out.println(str1 == str2);*/

/*        //true
        String str1 = "Jack";
        String str2 = new String("Jack");
        System.out.println(str1.equals(str2));*/



/*        StringBuilder xz = new StringBuilder();
        String newStr = xz.append("abc")
                .append(1)
                .append('-')
                .toString();
        System.out.println(newStr);*/



    }

}
