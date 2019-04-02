package grep;

import java.util.Scanner;

class FileName {

    private Scanner scanner = new Scanner(System.in);

    String getFileName()  {
        System.out.println("Pls enter file name: ");
        String fileName = scanner.nextLine();

        if (fileName.equals("")) {
            System.out.println("File name can`t be null, pls enter file name!");
            return getFileName();
        }
        return fileName;
    }
}