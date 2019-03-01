package WordGame;

import java.util.Scanner;

class GuessWord {

    private final WordSourse wordSourse = new WordSourse();
    private final CharacterMixer characterMixer = new CharacterMixer();


    public static void main(String[] args) {
    GuessWord play = new GuessWord();
    play.playGame();
    }

    void playGame(){
        Scanner console = new Scanner(System.in);
        String word = wordSourse.getWord();
        String mixedWord = characterMixer.mix(word);
        System.out.printf("Угадайте слово: %s%n", mixedWord);

        String userWord = console.nextLine();

        if(word.equalsIgnoreCase(userWord)){
            System.out.println("Ай маладец!)");
        } else {
            System.out.println("Ой не маладец(((");
        }
    }
}
