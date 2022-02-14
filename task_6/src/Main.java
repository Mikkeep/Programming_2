import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give the filename of the wordlist: ");
        String sanatiedosto = input.nextLine();

        Sanalista sanalista = new Sanalista(sanatiedosto);

        System.out.println("Please choose what kind of words are populated for the wordlist:");
        System.out.println("1. Regular, all words from the wordlist");
        System.out.println("2. Words with only specified length, chosen later");
        System.out.println("3. Words with only specific letter combinations provided by user\n E.G ___as__e");

        int option = input.nextInt();
        input.nextLine();

        switch (option) {

            case 1 -> {
                System.out.println("Populating wordlist with all of available words");
            }

            case 2 -> {
                System.out.println("Please provide wanted length for the words: ");
                int wordLength = input.nextInt();
                sanalista.sanatJoidenPituusOn(wordLength);
            }

            case 3 -> {
                System.out.println("Please give the chosen characters for the words: ");
                String chosenChars = input.nextLine();
                sanalista.sanatJoissaMerkit(chosenChars);
            }

            default -> throw new IllegalStateException("Unexpected value: " + option);
        }

        System.out.println("You have 5 chances to guess the hidden word");
        System.out.println("Upper and lower case letters are treated as equals");
        System.out.println("Each wrong guess reduces lives by 1, until 0 is left and the game ends");
        System.out.println("If guessed correctly, player wins the game");

        ArrayList<Character> guessedChars = new ArrayList<>();

        Hirsipuu hirsipuu = new Hirsipuu(5, sanalista, guessedChars);

        while (true) {

            System.out.println("Enter character: ");
            char guess = input.next().charAt(0);
            guess = Character.toUpperCase(guess);

            boolean result = hirsipuu.arvaa(guess);
            if (result) {
                System.out.println("The word contains letter: " + guess + "!");
            } else {
                System.out.println("Wrong guess!");
                System.out.println("Lives left: " + hirsipuu.arvauksiaOnJaljella());
            }
            boolean gameState = hirsipuu.onLoppu();
            if (gameState) {
                if (hirsipuu.arvauksiaOnJaljella() == 0) {
                    System.out.println("Computer wins this game of hangman!");
                } else {
                    System.out.println("Player wins this game of hangman!");
                    System.out.print("The guessed word was: ");
                    System.out.println(hirsipuu.salattuSana());
                }
                return;
            } else {
                System.out.println(hirsipuu.salattuSana());
                System.out.println("Guesses: " + hirsipuu.arvaukset());
            }

        }
    }
}
