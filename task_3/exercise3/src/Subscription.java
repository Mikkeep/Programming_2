import java.util.InputMismatchException;

abstract class Subscription {

    private String lehden_nimi;
    private String tilaajan_nimi;
    private String toimitusosoite;
    private double kuukausihinta;

    public Subscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta) {
        this.lehden_nimi = lehden_nimi;
        this.tilaajan_nimi = tilaajan_nimi;
        this.toimitusosoite = toimitusosoite;
        this.kuukausihinta = kuukausihinta;
    }

    public String getLehden_nimi() {
        return lehden_nimi;
    }

    public void setLehden_nimi(String lehden_nimi) {
        this.lehden_nimi = lehden_nimi;
    }

    public String getTilaajan_nimi() {
        return tilaajan_nimi;
    }

    public void setTilaajan_nimi(String tilaajan_nimi) {
        this.tilaajan_nimi = tilaajan_nimi;
    }

    public String getToimitusosoite() {
        return toimitusosoite;
    }

    public void setToimitusosoite(String toimitusosoite) {
        this.toimitusosoite = toimitusosoite;
    }

    public double getKuukausihinta() {
        return kuukausihinta;
    }

    public void setKuukausihinta(double kuukausihinta) {
        try {
            if (kuukausihinta < 0) {
                System.out.println("The monthly price cannot be less than 0");
                System.exit(1);
            }
            this.kuukausihinta = kuukausihinta;
        }
        catch (InputMismatchException e) {
            System.out.println("Please input only numbers as price");
            System.exit(1);
        }
    }

    public abstract void printInvoice();
}
