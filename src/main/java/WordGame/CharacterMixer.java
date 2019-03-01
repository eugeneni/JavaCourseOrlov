package WordGame;

import java.util.concurrent.ThreadLocalRandom;

class CharacterMixer {

    String mix (String word){
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++){
            int index = ThreadLocalRandom.current().nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }
        return new String(characters);
    }
}
