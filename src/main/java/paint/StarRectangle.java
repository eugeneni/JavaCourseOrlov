package paint;

public class StarRectangle {

    public static void main(String[] args) {
        printFigure(9);
    }

    public static void printFigure(int spaceCount) {
        int width = 5 + 4 * spaceCount;
        int height = (spaceCount / 3 + 1) * 4 + 1; //сразу учитываем последнюю строку
        int step = spaceCount / 3 + 1; //расчет шага
        int fullRow = step + 1;

        for (int i = 1; i <= height; i++) {

            int fullColumn = spaceCount + 2;

            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == fullRow || j == 1 || j == fullColumn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                //увеличиваем fullRow только когда дойдем до конца строки
                if (i == fullRow && j == width) {
                    fullRow = fullRow + step;
                }

                if (j == fullColumn) {
                    fullColumn += spaceCount +1;
                }
            }
            System.out.println();
        }
    }
}