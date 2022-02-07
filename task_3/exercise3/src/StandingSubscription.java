class StandingSubscription extends Subscription{

    private int alennusprosentti;

    public StandingSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta) {
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta);
    }

    public int getAlennusprosentti() {
        return alennusprosentti;
    }

    public void setAlennusprosentti(int alennusprosentti) {
        if (alennusprosentti < 0 || alennusprosentti > 100) {
            System.out.println("Percentages are input in a ( 0 - 100 ) % format");
            System.exit(1);
        }
        this.alennusprosentti = alennusprosentti;
    }

    public double getSubscriptionPrize() {
        return (12 * getKuukausihinta()) - (( 12 * getKuukausihinta() ) * this.alennusprosentti / 100 );
    }

    @Override
    public void printInvoice() {
        System.out.println("" +
                "Subscription type: " + getClass().getName() + "\n" +
                "Name of magazine: " + getLehden_nimi() + "\n" +
                "Subscriber name: " + getTilaajan_nimi() + "\n" +
                "Billing address: " + getToimitusosoite() + "\n" +
                "Months subscribed : " + 12 + "\n" +
                "Prize of the subscription: " + getSubscriptionPrize() + "\n" +
                "");
    }

    @Override
    public String toString() {
        return "" +
                "Subscription type: " + getClass().getName() + "\n" +
                "Name of magazine: " + getLehden_nimi() + "\n" +
                "Subscriber name: " + getTilaajan_nimi() + "\n" +
                "Billing address: " + getToimitusosoite() + "\n" +
                "Months subscribed : " + 12 + "\n" +
                "Prize of the subscription: " + getSubscriptionPrize() + "\n" +
                "";
    }
}
