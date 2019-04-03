package word_game;

import java.util.concurrent.ThreadLocalRandom;

class WordSourse {

    private static final String[] WORDS = {
            "animal",
            "planet",
            "discovery",
            "cat",
            "earth",
            "ocean"
    };

    String getWord() {
        int index = ThreadLocalRandom.current().nextInt(WORDS.length);
        return WORDS[index];
    }
}
