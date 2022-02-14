import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sanalista {

    private String locationWords;
    private ArrayList<String> sanalista;

    public Sanalista(String locationWords) {
        sanalista = new ArrayList<>();
        this.locationWords = locationWords;
        try (BufferedReader sanat = new BufferedReader( new FileReader(this.locationWords))) {
            String sana;
            while ((sana = sanat.readLine()) != null) {
                sanalista.add(sana);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Wordlist file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLocationWords() {
        return locationWords;
    }

    public ArrayList<String> sanatJoidenPituusOn(int pituus) {
        sanalista.removeIf(sana -> sana.length() != pituus);
        return sanalista;
    }

    public ArrayList<String> sanatJoissaMerkit(String mjono) {
        char[] correctChars = mjono.toCharArray();
        List <String> removeWords = new ArrayList<>();
        for (String sana: sanalista
             ) {
            for (int i = 0; i < correctChars.length; i++) {
                if (correctChars[i] != '_') {
                    char letter = mjono.charAt(i);
                    char compareLetter = sana.charAt(i);
                    if (compareLetter != letter) {
                        removeWords.add(sana);
                    }
                }
            }
        }
        sanalista.removeAll(removeWords);
        return sanalista;
    }

    public List<String> annaSanat() {
        return sanalista;
    }
}
