package grep;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class ReadFile {

    void openFile(String fileName) throws Exception {
        String line;

        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName));
        ArrayList<String> wordsList = new ArrayList<>();


        while ((line = lineNumberReader.readLine()) != null) {
            ArrayList<String> word = new ArrayList<>(Arrays.asList(line.split("\\s")));
            wordsList.addAll(word);
        }

        Map<String, Integer> map = new TreeMap<>();
        for (String word : wordsList) {
            if (map.containsKey(word)) {
                int countWord = map.get(word);
                map.replace(word, ++countWord);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println(map);
        lineNumberReader.close();
    }
}