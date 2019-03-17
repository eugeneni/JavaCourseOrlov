package Calculate;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double first = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double second = scanner.nextDouble();

        System.out.println("Введите операцию: ");
        String operation = scanner.next();

        try {
            System.out.println("Результат: " + new Calculator().calculate(first,second,operation));
        } catch (ArithmeticException arEx){
            System.out.println("Деление на ноль запрещено");
        } catch (Exception ex){
            System.out.println("Новая ошибка: " + ex.getMessage());
        }
    }
}
