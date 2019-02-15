package Paint;

public class StarRectangle {

    public static void main(String[] args) {
        int width = 6;


        for (int grid = 1; grid < 4; grid++) {

            StarRectangle.firstString(width);

            System.out.println();
            System.out.print("*");

            StarRectangle.secondString(width);

            System.out.println();
        }

        StarRectangle.firstString(width);
    }


    public static void firstString(int width) {
        int newWidth = 5 + 4 * width;

        for (int i = 1; i <= newWidth; i++) {
            System.out.print("*");
        }
    }

    public static void secondString(int width) {
        if (width == 3) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("   *");
            }
        } else if (width == 6) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("      *");
               // System.out.println();
                //System.out.println("      *");
            }
        } else if(width == 9) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("         *");
            }
        }
    }
}