package Programs;

import figures.*;

import java.util.Scanner;

public class LaunchFigureProgram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите тип фигуры: квадрат = 1, круг = 2, прямоугольник = 3, треугольник = 4: ");
        int typeFigure = scan.nextInt();

        AbstractFigure figure = null;

        switch (typeFigure)
        {
            case 1:
                System.out.println("Введите сторону квадрата: ");
                double sizeA = scan.nextInt();

//                figures.Square square = new figures.Square(sizeA);
//                System.out.println("Площадь квадрата : " + square.Area());
//                System.out.println("Периметр квадрата : " + square.Perimeter());

                figure = new Square(sizeA);
                break;

            case 2:
                System.out.println("Введите радиус круга: ");
                double radius = scan.nextInt();

                figure = new Circle(radius);
                break;

            case 3:
                System.out.println("Введите первую сторону прямоугольника: ");
                double sizeFirst = scan.nextInt();
                System.out.println("Введите вторую сторону прямоугольника: ");
                double sizeSecond = scan.nextInt();

                figure = new Rectangle(sizeFirst, sizeSecond);
                break;

            case 4:
                System.out.println("Введите первую сторону треугольника: ");
                double triangleFirstSize = scan.nextInt();
                System.out.println("Введите вторую сторону треугольника: ");
                double triangleSecondSize = scan.nextInt();
                System.out.println("Введите третью сторону треугольника: ");
                double triangleThirdSize = scan.nextInt();

                figure = new Triangle(triangleFirstSize, triangleSecondSize, triangleThirdSize);
                break;

            default:
                System.out.println("Придурок, надо было вводить цифры от 1 до 4 :)");
        }

        if (figure != null)
        {
            System.out.println("Площадь : " + figure.Area());
            System.out.println("Периметр : " + figure.Perimeter());
        }
    }
}