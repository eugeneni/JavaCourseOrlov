package Course;

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

    public static int Speed (int timeMin, int distanceKl){
        int meter = distanceKl / 1000;
        int sec = timeMin / 60;
        int speed = meter / sec;

        System.out.println(speed);

        return speed;
    }
}
