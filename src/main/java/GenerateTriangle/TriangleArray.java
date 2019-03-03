package GenerateTriangle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

class TriangleArray {

    public static void main(String[] args) {
        LinkedList triangleTypes = new LinkedList(Arrays.asList("равносторонний", "прямоугольный", "равнобедренный", "произвольный"));

        Triangle triangleArray[] = createTriangle(100_000);

/*        for (Triangle someTrinagle : triangleArray) {
            System.out.println("тип треугольника: " + someTrinagle.type() +
                    ", сторона АБ: " + someTrinagle.a.distance(someTrinagle.b) +
                    ", сторона БС: " + someTrinagle.b.distance(someTrinagle.c) +
                    ", сторона АС: " + someTrinagle.c.distance(someTrinagle.a));
        }*/

        for (int i = 0; i < triangleArray.length; i++) {
            if (triangleTypes.contains(triangleArray[i].type())) {
                System.out.println("Тип треугольника: " + triangleArray[i].type() +
                        " индекс: " + i +
                        " точки треугольника: " + triangleArray[i].a.x + triangleArray[i].a.y +
                        +triangleArray[i].b.x + triangleArray[i].b.y +
                        +triangleArray[i].c.x + triangleArray[i].c.y +
                        " периметр: " + triangleArray[i].perimeter() +
                        " площадь: " + triangleArray[i].square());
                triangleTypes.remove(triangleArray[i].type());
            } else if (triangleTypes.isEmpty()) {
                break;
            }
        }

        if (!triangleTypes.isEmpty()) {
            System.out.println("треугольники не найдены: " + triangleTypes);
        }

        int countProisvolniy = 0;
        int countRavnobedreniy = 0;
        int countRavnostoroniy = 0;
        int countPriamoygolniy = 0;
        for (int i = 0; i < triangleArray.length; i++) {
            if (triangleArray[i].type().equalsIgnoreCase("произвольный")) {
                countProisvolniy = countProisvolniy + 1;
            } else if (triangleArray[i].type().equalsIgnoreCase("равнобедренный")) {
                countRavnobedreniy = countRavnobedreniy + 1;
            } else if (triangleArray[i].type().equalsIgnoreCase("равносторонний")) {
                countRavnostoroniy = countRavnostoroniy + 1;
            } else {
                countPriamoygolniy = countPriamoygolniy + 1;
            }
        }
        System.out.println("кол-во произвольных: " + countProisvolniy +
                " кол-во равнобедренных: " + countRavnobedreniy +
                " кол-во равносторонних: " + countRavnostoroniy +
                " кол-во прямоугольных: " + countPriamoygolniy);
    }

    static Triangle[] createTriangle(int countArray) {
        Triangle[] array = new Triangle[countArray];

        for (int i = 0; i < array.length; i++) {
            Point a = new Point(ThreadLocalRandom.current().nextFloat(), ThreadLocalRandom.current().nextFloat());
            Point b = new Point(ThreadLocalRandom.current().nextFloat(), ThreadLocalRandom.current().nextFloat());
            Point c = new Point(ThreadLocalRandom.current().nextFloat(), ThreadLocalRandom.current().nextFloat());

            array[i] = new Triangle(a, b, c);
        }
        return array;
    }
}
