import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hirsipuu {

    private int guesses;
    private String guessedWord;
    private char[] hiddenWord;
    private Sanalista sanalista;
    private ArrayList<Character> guessedChars;

    public Hirsipuu(int guesses, Sanalista sanalista, ArrayList<Character> guessedChars) {
        this.guesses = guesses;
        this.sanalista = sanalista;
        this.guessedChars = guessedChars;
        setGuessedWord();

        hiddenWord = new char[this.guessedWord.length()];

        Arrays.fill(hiddenWord, '_');
        System.out.println(hiddenWord);
    }

    public void setGuessedWord() {
        Random random = new Random();
        this.guessedWord = sanalista.annaSanat().get(random.nextInt(sanalista.annaSanat().size())).toUpperCase();
    }

    public boolean arvaa(Character merkki) {

        char[] guess = guessedWord.toCharArray();
        int counter = 0;

        for (int i = 0; i < guessedWord.length(); i++) {
            if (guess[i] == merkki) {
                hiddenWord[i] = merkki;
                counter += 1;
            }
        }
        if (guessedChars.contains(merkki)) {
            System.out.println("You have already guessed " + merkki + " previously!");
        } else {
            guessedChars.add(merkki);
        }
        if (counter == 0) {
            this.guesses -= 1;
            return false;
        }
        return true;
    }

    public int arvauksiaOnJaljella() {
        return guesses;
    }

    public List<Character> arvaukset() {
        return guessedChars;
    }

    public String sana() {
        return guessedWord;
    }

    public char[] salattuSana() {
        return hiddenWord;
    }

    public boolean onLoppu() {
        int counter = 0;

        if (guesses == 0) {
            return true;
        }
        for (char c : hiddenWord) {
            if (c == '_') {
                counter += 1;
            }
        }
        if (counter > 0) {
            return false;
        }
        return true;
    }

}
