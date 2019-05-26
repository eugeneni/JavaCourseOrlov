package grep;

import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) {
        System.out.println("For quit the app enter '0'");

        FileName fileName = new FileName();
        ReadFile readFile = new ReadFile();

        while (true) {
            String name = fileName.getFileName();

            try {
                readFile.openFile(name);
            } catch (FileNotFoundException ex) {
                System.err.println("File not found: " + ex);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (name.equals("0")) {
                break;
            }
        }
    }
}