package grep;

import java.io.FileReader;
import java.io.LineNumberReader;

class ReadFile {

    void openFile(String fileName) throws Exception {
        String line;

        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName));

        while ((line = lineNumberReader.readLine()) != null) {
            System.out.println("Строка: " + line);
        }

        System.out.println(lineNumberReader.getLineNumber());
        lineNumberReader.close();
        //xz test
    }
}